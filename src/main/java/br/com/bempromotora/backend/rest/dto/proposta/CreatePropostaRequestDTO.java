package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class CreatePropostaRequestDTO {

    @NotNull
    private ClienteDTO cliente;

    @NotNull
    private BigDecimal valor;

    private UsuarioDTO usuario;

    private String observacao;


}
