package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubmissaoPropostaRequest extends AbstractProcessorDTO {

    private Long idProposta;

    private UsuarioEntity usuario;

}
