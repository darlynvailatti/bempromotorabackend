
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;
import lombok.Data;

@Data
public class ConvenioDTO extends AbstractRestDTO {

	private Long idConvenio;
	
	private String descricao;
	
}
