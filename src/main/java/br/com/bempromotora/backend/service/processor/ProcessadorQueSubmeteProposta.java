package br.com.bempromotora.backend.service.processor;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessor;
import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaEnum;
import br.com.bempromotora.backend.repository.IPropostaRepository;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaRequest;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProcessadorQueSubmeteProposta extends AbstractProcessor<SubmissaoPropostaRequest, SubmissaoPropostaResponse> {

    @Autowired
    private IPropostaRepository propostaRepository;
    private PropostaEntity propostaEntity;

    @Override
    protected void validateInput() throws Exception {
        EnsuresThat.isNotNull(input.getIdProposta(), "Proposta inexistente");
    }

    @Override
    protected void executionImplementation() throws Exception {
        Long idProposta = input.getIdProposta();
        Optional<PropostaEntity> propostaById = propostaRepository.findById(idProposta);
        EnsuresThat.isTrue(propostaById.isPresent(), "Proposta {0} inexistente", idProposta);
        propostaEntity = propostaById.get();
        propostaEntity.setSituacao(SituacaoPropostaEnum.SUBMETIDA_PARA_ANALISE);
        propostaEntity = propostaRepository.save(propostaEntity);
    }

    @Override
    protected SubmissaoPropostaResponse executionReturn() throws Exception {
        return SubmissaoPropostaResponse.builder()
                .detalhes("Submetida com sucesso")
                .isSubmetida(true)
                .propostaEntity(propostaEntity)
                .build();
    }

    @Override
    protected String getName() {
        return null;
    }
}
