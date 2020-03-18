package br.com.bempromotora.backend.rest.controller;

import br.com.bempromotora.backend.rest.converter.ClienteEntityToDTOConverter;
import br.com.bempromotora.backend.rest.converter.CreateClienteRequestConverter;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.dto.cliente.CreateClienteRequestDTO;
import br.com.bempromotora.backend.service.IClienteService;
import br.com.bempromotora.backend.service.dto.CreateClienteRequest;
import br.com.bempromotora.backend.service.dto.CreateClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RepositoryRestController
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @Autowired
    private ClienteEntityToDTOConverter clienteEntityToDTOConverter;

    @Autowired
    private CreateClienteRequestConverter createClienteRequestConverter;

    @RequestMapping(path = "/clientes", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<ClienteDTO> createCliente(@RequestBody CreateClienteRequestDTO createClienteRequestDTO){
        CreateClienteRequest createClienteRequest = createClienteRequestConverter.convert(createClienteRequestDTO);
        CreateClienteResponse createClienteResponse = clienteService.createCliente(createClienteRequest);
        ClienteDTO clienteDTO = clienteEntityToDTOConverter.convert(createClienteResponse.getClienteEntity());
        return ResponseEntity.ok(clienteDTO);
    }

}
