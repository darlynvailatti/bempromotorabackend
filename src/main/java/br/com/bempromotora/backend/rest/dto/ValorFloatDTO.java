
package br.com.bempromotora.backend.rest.dto;

import java.math.BigDecimal;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;


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
