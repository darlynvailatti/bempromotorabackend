package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.architecture.transporte.pattern.AbstractDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmissaoPropostaResponseDTO extends AbstractDTO {

    private PropostaDTO propostaDTO;

    private boolean isSubmetida;

    private String detalhes;

}
