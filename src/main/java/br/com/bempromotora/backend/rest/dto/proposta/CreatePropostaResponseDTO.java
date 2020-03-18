package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.architecture.transporte.pattern.AbstractDTO;
import lombok.Data;

@Data
public class CreatePropostaResponseDTO extends AbstractDTO {

    private PropostaDTO propostaDTO;

}
