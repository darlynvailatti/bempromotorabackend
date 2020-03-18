package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import br.com.bempromotora.backend.repository.IUsuarioRepository;
import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioDTOToEntityConverter implements RestConverter<UsuarioDTO, UsuarioEntity> {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public UsuarioEntity convert(UsuarioDTO usuarioDTO) {
        return usuarioRepository.findById(usuarioDTO.getIdUsuario()).get();
    }
}
