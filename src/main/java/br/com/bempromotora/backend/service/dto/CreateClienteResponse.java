package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateClienteResponse extends AbstractProcessorDTO {

    private ClienteEntity clienteEntity;

}
