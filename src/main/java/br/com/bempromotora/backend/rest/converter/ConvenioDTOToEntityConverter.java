package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.architecture.util.ExpectThat;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.repository.IConvenioRepository;
import br.com.bempromotora.backend.rest.dto.ConvenioDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConvenioDTOToEntityConverter implements RestConverter<ConvenioDTO, ConvenioEntity> {

    @Autowired
    private IConvenioRepository convenioRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ConvenioEntity convert(ConvenioDTO convenioDTO) {
        Long idConvenio = convenioDTO.getIdConvenio();
        if(ExpectThat.isNotNull(idConvenio)){
            return convenioRepository.findById(idConvenio).get();
        }else {
            return modelMapper.map(convenioDTO, ConvenioEntity.class);
        }
    }
}
