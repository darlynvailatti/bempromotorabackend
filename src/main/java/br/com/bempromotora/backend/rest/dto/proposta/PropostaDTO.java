
package br.com.bempromotora.backend.rest.dto.proposta;

import br.com.bempromotora.backend.rest.dto.cliente.ClienteDTO;
import br.com.bempromotora.backend.rest.dto.UsuarioDTO;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;


@Data
public class PropostaDTO extends AbstractRestDTO {

	private Long idProposta;

	private SituacaoPropostaEnumDTO situacao;

	private ClienteDTO cliente;

	private String convenio;

	private String matriculaConvenio;
	
	private BigDecimal valor;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime data;

	private UsuarioDTO usuario;

	private String protocolodoConvenio;

	private String observacao;
	
}
