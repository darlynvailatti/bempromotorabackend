package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.architecture.util.ExpectThat;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import br.com.bempromotora.backend.rest.dto.proposta.SubmissaoPropostaRequestDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import br.com.bempromotora.backend.service.dto.SubmissaoPropostaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SubmissaoPropostaRequestDTOToEntityConverter implements RestConverter<SubmissaoPropostaRequestDTO, SubmissaoPropostaRequest> {

    @Autowired
    private UsuarioDTOToEntityConverter usuarioDTOToEntityConverter;

    @Override
    public SubmissaoPropostaRequest convert(SubmissaoPropostaRequestDTO submissaoPropostaRequestDTO) {
        UsuarioDTO usuarioDTO = submissaoPropostaRequestDTO.getUsuarioDTO();

        UsuarioEntity usuarioEntity = null;
        if(ExpectThat.isNotNull(usuarioDTO)) {
            usuarioEntity = usuarioDTOToEntityConverter.convert(usuarioDTO);
        }

        return SubmissaoPropostaRequest.builder()
                .idProposta(submissaoPropostaRequestDTO.getIdProposta())
                .usuario(usuarioEntity)
                .build();
    }
}
