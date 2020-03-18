package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.rest.dto.cliente.CreateClienteRequestDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import br.com.bempromotora.backend.service.dto.CreateClienteRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateClienteRequestConverter implements RestConverter<CreateClienteRequestDTO, CreateClienteRequest> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CreateClienteRequest convert(CreateClienteRequestDTO createClienteRequestDTO) {
        return modelMapper.map(createClienteRequestDTO, CreateClienteRequest.class);
    }

}
