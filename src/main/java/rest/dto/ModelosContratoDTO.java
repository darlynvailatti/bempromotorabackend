
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class ModelosContratoDTO extends AbstractRestDTO {

	private Long modeloContrato;
	
	private String nome;
	
	
	public Long getModeloContrato(){
		return this.modeloContrato;
	}

    	public void setModeloContrato(Long modeloContrato){
        	this.modeloContrato = modeloContrato;
	}
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
        	this.nome = nome;
	}
	
}
