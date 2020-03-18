package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmissaoPropostaRequestDTO {

    private Long idProposta;

    private UsuarioDTO usuarioDTO;

}
