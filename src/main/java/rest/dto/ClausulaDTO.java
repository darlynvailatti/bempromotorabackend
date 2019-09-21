
package rest.dto;

import rest.pattern.AbstractRestDTO;
import java.time.LocalDate;

public class ClausulaDTO extends AbstractRestDTO {
	private Long clausula;

	private String descricao;

	private LocalDate dataFinalDeVigencia;
	
	
	public Long getClausula(){
		return this.clausula;
	}

    	public void setClausula(Long clausula){
        	this.clausula = clausula;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public LocalDate getDataFinalDeVigencia(){
		return this.dataFinalDeVigencia;
	}

	public void setDataFinalDeVigencia(LocalDate dataFinalDeVigencia){
        	this.dataFinalDeVigencia = dataFinalDeVigencia;
	}
	
}
