package br.com.bempromotora.backend.service.dto;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessorDTO;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioEntity;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class CreatePropostaRequest extends AbstractProcessorDTO {

    @NotNull
    private ConvenioEntity convenio;

    @NotNull
    private ClienteEntity cliente;

    @NotNull
    private BigDecimal valor;

    private UsuarioEntity usuario;

    private String observacao;


}
