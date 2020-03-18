package br.com.bempromotora.backend.rest.converter;


import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.repository.IClienteRepository;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.pattern.RestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDTOToEntityConverter implements RestConverter<ClienteDTO, ClienteEntity> {

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public ClienteEntity convert(ClienteDTO clienteDTO) {
        Long idCliente = clienteDTO.getIdCliente();
        return clienteRepository.findById(idCliente).get();
    }
}
