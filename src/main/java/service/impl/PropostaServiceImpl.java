package service.impl;

import architecture.exception.BusinessLogicException;
import architecture.util.EnsuresThat;
import architecture.util.ExpectThat;
import domain.proposta.PropostaEntity;
import domain.proposta.SituacaoPropostaCreditoEnum;
import domain.proposta.regra.ModeloRegraPropostaEntity;
import domain.proposta.regra.RegraEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.IModeloRegraPropostaRepository;
import repository.IPropostaRepository;
import repository.IRegraRepository;
import service.IPropostaService;
import service.dto.ValidaRegrasSobrePropostaDTO;
import service.processor.ProcessadorQueValidaRegrasSobreProposta;

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


    public ValidaRegrasSobrePropostaDTO.RetornoDTO validarRegrasSobreProposta(Long idProposta) throws Exception {
        PropostaEntity proposta = propostaRepository.findFetchById(idProposta);

        Pageable fullPaginated = new PageRequest(0,Integer.MAX_VALUE);

        Page<ModeloRegraPropostaEntity> modelosVigentesPaginados = modeloRegraPropostaRepository.findVigente(fullPaginated);
        List<ModeloRegraPropostaEntity> modelosVigentes = modelosVigentesPaginados.getContent();
        ModeloRegraPropostaEntity primeiroModeloVigente = modelosVigentes.stream().findFirst().get();

        Page<RegraEntity> regrasDoModeloVigentePaginados = regraRepository.findFetchByIdModeloProposta(primeiroModeloVigente.getId(), fullPaginated);
        List<RegraEntity> regrasDoModeloVigente = regrasDoModeloVigentePaginados.getContent();

        boolean naoExistemRegrasParaOModelo = ExpectThat.isNotNullAndNotEmpty(regrasDoModeloVigente);
        EnsuresThat.isFalse(naoExistemRegrasParaOModelo, "Não existem regras vigentes para o modelo {0}", primeiroModeloVigente.getId());

        ValidaRegrasSobrePropostaDTO valida = new ValidaRegrasSobrePropostaDTO(proposta, regrasDoModeloVigente);
        return processadorQueValidaRegrasSobreProposta.execute(valida);
    }
    

}
