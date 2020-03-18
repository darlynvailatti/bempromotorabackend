
package br.com.bempromotora.backend.rest.dto.cliente;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ClienteDTO extends AbstractRestDTO {

	private Long idCliente;

	private String nome; 

	private LocalDate dataNascimento;

	private Boolean bloqueado;

}
