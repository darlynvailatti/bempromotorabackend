package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmissaoPropostaResponse extends AbstractProcessorDTO {

    private PropostaEntity propostaEntity;

    private boolean isSubmetida;

    private String detalhes;

}
