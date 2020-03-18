package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteEntityToDTOConverter implements RestConverter<ClienteEntity, ClienteDTO> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ClienteDTO convert(ClienteEntity clienteEntity) {
        return modelMapper.map(clienteEntity, ClienteDTO.class);
    }
}
