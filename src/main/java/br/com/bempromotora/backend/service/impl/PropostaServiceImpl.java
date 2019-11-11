package br.com.bempromotora.backend.service.impl;

import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.architecture.util.ExpectThat;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.ModeloRegraPropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import br.com.bempromotora.backend.repository.IModeloRegraPropostaRepository;
import br.com.bempromotora.backend.repository.IPropostaRepository;
import br.com.bempromotora.backend.repository.IRegraRepository;
import br.com.bempromotora.backend.service.IPropostaService;
import br.com.bempromotora.backend.service.dto.ValidaRegrasSobrePropostaDTO;
import br.com.bempromotora.backend.service.processor.ProcessadorQueValidaRegrasSobreProposta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropostaServiceImpl implements IPropostaService {

    @Autowired
    private IPropostaRepository propostaRepository;

    @Autowired
    private IModeloRegraPropostaRepository modeloRegraPropostaRepository;

    @Autowired
    private IRegraRepository regraRepository;

    private ProcessadorQueValidaRegrasSobreProposta processadorQueValidaRegrasSobreProposta;


    public ValidaRegrasSobrePropostaDTO.RetornoDTO validarRegrasSobreProposta(Long idProposta) throws Exception {
        PropostaEntity proposta = propostaRepository.findById(idProposta).orElse(null);

        Pageable fullPaginated = new PageRequest(0,Integer.MAX_VALUE);

        Page<ModeloRegraPropostaEntity> modelosVigentesPaginados = modeloRegraPropostaRepository.findAll(fullPaginated);
        modelosVigentesPaginados.getContent().removeIf(m -> m.getDataFimVigencia().compareTo(LocalDate.now()) < 0);
        List<ModeloRegraPropostaEntity> modelosVigentes = modelosVigentesPaginados.getContent();
        ModeloRegraPropostaEntity primeiroModeloVigente = modelosVigentes.stream().findFirst().get();

        Page<RegraEntity> regrasDoModeloVigentePaginados = regraRepository.findByModeloRegraId(primeiroModeloVigente.getId(), fullPaginated);
        List<RegraEntity> regrasDoModeloVigente = regrasDoModeloVigentePaginados.getContent();

        boolean naoExistemRegrasParaOModelo = ExpectThat.isNotNullAndNotEmpty(regrasDoModeloVigente);
        EnsuresThat.isFalse(naoExistemRegrasParaOModelo, "Não existem regras vigentes para o modelo {0}", primeiroModeloVigente.getId());

        ValidaRegrasSobrePropostaDTO valida = new ValidaRegrasSobrePropostaDTO(proposta, regrasDoModeloVigente);
        return processadorQueValidaRegrasSobreProposta.execute(valida);
    }
    

}
