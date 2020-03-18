
package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
public class PropostaDTO extends AbstractRestDTO {

	private Long idProposta;

	private SituacaoPropostaEnumDTO situacao;

	private ClienteDTO cliente;

	private String convenio;

	private String matriculaConvenio;
	
	private BigDecimal valor;

	private LocalDateTime data;

	private UsuarioDTO usuario;

	private String protocolodoConvenio;

	private String observacao;
	
}
