package br.com.bempromotora.backend.service.impl;

import br.com.bempromotora.backend.service.IClienteService;
import br.com.bempromotora.backend.service.dto.CreateClienteRequest;
import br.com.bempromotora.backend.service.dto.CreateClienteResponse;
import br.com.bempromotora.backend.service.processor.ProcessadorQueCriaCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ProcessadorQueCriaCliente processadorQueCriaCliente;

    @Override
    public CreateClienteResponse createCliente(CreateClienteRequest createClienteRequest) {
        try {
            return processadorQueCriaCliente.execute(createClienteRequest);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
