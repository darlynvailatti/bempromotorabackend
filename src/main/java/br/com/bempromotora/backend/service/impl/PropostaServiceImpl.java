package br.com.bempromotora.backend.service.impl;

import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.architecture.util.ExpectThat;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.ModeloRegraPropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import br.com.bempromotora.backend.service.dto.*;
import br.com.bempromotora.backend.service.processor.ProcessadorQueCriaProposta;
import br.com.bempromotora.backend.service.processor.ProcessadorQueSubmeteProposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import br.com.bempromotora.backend.repository.IModeloRegraPropostaRepository;
import br.com.bempromotora.backend.repository.IPropostaRepository;
import br.com.bempromotora.backend.repository.IRegraRepository;
import br.com.bempromotora.backend.service.IPropostaService;
import br.com.bempromotora.backend.service.processor.ProcessadorQueValidaRegrasSobreProposta;

import java.time.LocalDate;
import java.util.List;

@Service
public class PropostaServiceImpl implements IPropostaService {

    @Autowired
    private IPropostaRepository propostaRepository;

    @Autowired
    private IModeloRegraPropostaRepository modeloRegraPropostaRepository;

    @Autowired
    private IRegraRepository regraRepository;

    private ProcessadorQueValidaRegrasSobreProposta processadorQueValidaRegrasSobreProposta;

    @Autowired
    private ProcessadorQueCriaProposta processadorQueCriaProposta;

    @Autowired
    private ProcessadorQueSubmeteProposta processadorQueSubmeteProposta;

    @Override
    public ValidaRegrasSobreProposta.RetornoDTO validarRegrasSobreProposta(Long idProposta) throws Exception {
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

        ValidaRegrasSobreProposta valida = new ValidaRegrasSobreProposta(proposta, regrasDoModeloVigente);
        return processadorQueValidaRegrasSobreProposta.execute(valida);
    }


    @Override
    public List<PropostaEntity> getAllPropostas() {
        PageRequest page = PageRequest.of(0, Integer.MAX_VALUE);
        return propostaRepository.findAll(page).getContent();
    }

    @Override
    public PropostaEntity getProposta(Long idProposta) {
        return propostaRepository.findById(idProposta).get();
    }

    @Override
    public CreatePropostaResponse createProposta(CreatePropostaRequest createProposta) {
        try {
            return processadorQueCriaProposta.execute(createProposta);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public SubmissaoPropostaResponse submeterProposta(SubmissaoPropostaRequest submissaoPropostaRequest) {
        try {
            return processadorQueSubmeteProposta.execute(submissaoPropostaRequest);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
