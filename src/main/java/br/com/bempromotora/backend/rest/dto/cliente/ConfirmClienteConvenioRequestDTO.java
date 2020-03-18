package br.com.bempromotora.backend.rest.dto.cliente;

import br.com.bempromotora.backend.architecture.transporte.pattern.AbstractDTO;
import br.com.bempromotora.backend.rest.dto.ConvenioDTO;
import lombok.Data;

@Data
public class ConfirmClienteConvenioRequestDTO extends AbstractDTO {

    private ClienteDTO cliente;

    private ConvenioDTO convenio;

    private String matricula;

}
