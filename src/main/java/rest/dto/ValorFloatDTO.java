
package rest.dto;

import java.math.BigDecimal;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;


public class ValorFloatDTO extends AbstractRestDTO{
	private Long idConteudo;
	private BigDecimal valorFloat;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public BigDecimal getValorFloat(){
		return this.valorFloat;
	}

	public void setValorFloat(BigDecimal valorFloat){
        	this.valorFloat = valorFloat;
	}
	
}
