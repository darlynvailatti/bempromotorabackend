package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.rest.dto.ConvenioDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioEntityToDTOConverter implements RestConverter<ConvenioEntity, ConvenioDTO> {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ConvenioDTO convert(ConvenioEntity convenioEntity) {
        return modelMapper.map(convenioEntity, ConvenioDTO.class);
    }
}
