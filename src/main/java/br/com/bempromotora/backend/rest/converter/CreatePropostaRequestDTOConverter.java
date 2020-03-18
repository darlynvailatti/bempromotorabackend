package br.com.bempromotora.backend.rest.converter;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.rest.dto.ConvenioDTO;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.dto.proposta.CreatePropostaRequestDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import br.com.bempromotora.backend.service.dto.CreatePropostaRequest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePropostaRequestDTOConverter implements RestConverter<CreatePropostaRequestDTO, CreatePropostaRequest> {

    @Autowired
    private ClienteDTOToEntityConverter clienteDTOConverter;

    @Autowired
    private ConvenioDTOToEntityConverter convenioDTOToEntityConverter;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CreatePropostaRequest convert(CreatePropostaRequestDTO createPropostaRequestDTO) {

        CreatePropostaRequest createPropostaRequest = modelMapper.map(createPropostaRequestDTO, CreatePropostaRequest.class);

        ClienteDTO clienteDTO = createPropostaRequestDTO.getCliente();
        ClienteEntity clienteEntity = clienteDTOConverter.convert(clienteDTO);

        ConvenioDTO convenioDTO = createPropostaRequestDTO.getConvenio();
        ConvenioEntity convenioEntity = convenioDTOToEntityConverter.convert(convenioDTO);

        createPropostaRequest.setCliente(clienteEntity);
        createPropostaRequest.setConvenio(convenioEntity);

        return createPropostaRequest;
    }
}
