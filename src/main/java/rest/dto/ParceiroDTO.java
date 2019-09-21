
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class ParceiroDTO extends AbstractRestDTO {

	private Long idParceiro;

	private String apelido;
	
	private String ativo;
	
	public Long getIdParceiro(){
		return this.idParceiro;
	}

    	public void setIdParceiro(Long idParceiro){
        	this.idParceiro = idParceiro;
	}
	public String getApelido(){
		return this.apelido;
	}

	public void setApelido(String apelido){
        	this.apelido = apelido;
	}
	public String getAtivo(){
		return this.ativo;
	}

	public void setAtivo(String ativo){
        	this.ativo = ativo;
	}
	
}
