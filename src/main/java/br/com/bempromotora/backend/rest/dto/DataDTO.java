
package br.com.bempromotora.backend.rest.dto;

import java.time.LocalDate;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class DataDTO extends AbstractRestDTO{
	private Long idConteudo;
	
	/** 
	* Data (DataHora NOT NULL date)
	*/
	 private LocalDate dataHora;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public LocalDate getDataHora(){
		return this.dataHora;
	}

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	}
	
}
