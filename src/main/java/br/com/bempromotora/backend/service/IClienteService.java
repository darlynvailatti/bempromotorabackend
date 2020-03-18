package br.com.bempromotora.backend.service;


import br.com.bempromotora.backend.service.dto.CreateClienteRequest;
import br.com.bempromotora.backend.service.dto.CreateClienteResponse;

public interface IClienteService {

    CreateClienteResponse createCliente(CreateClienteRequest createClienteRequest);

}
