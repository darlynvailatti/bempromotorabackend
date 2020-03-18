
package br.com.bempromotora.backend.rest.dto;

import java.time.LocalDate;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;
import lombok.Data;

@Data
public class DataDTO extends AbstractRestDTO{

	private LocalDate conteudo;
	
}
