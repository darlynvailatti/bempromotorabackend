
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

public class ModeloRegrasPropostaDTO extends AbstractRestDTO {

	private Long idModeloDeRegra;
	
	private String descricao;
	
	 private LocalDate dataInicioVigencia;
	
	 private LocalDate dataFimVigencia;
	
	public Long getIdModeloDeRegra(){
		return this.idModeloDeRegra;
	}

    	public void setIdModeloDeRegra(Long idModeloDeRegra){
        	this.idModeloDeRegra = idModeloDeRegra;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public LocalDate getDataInicioVigencia(){
		return this.dataInicioVigencia;
	}

	public void setDataInicioVigencia(LocalDate dataInicioVigencia){
        	this.dataInicioVigencia = dataInicioVigencia;
	}
	public LocalDate getDataFimVigencia(){
		return this.dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDate dataFimVigencia){
        	this.dataFimVigencia = dataFimVigencia;
	}
	
}
