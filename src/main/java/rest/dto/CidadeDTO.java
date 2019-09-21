
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class CidadeDTO extends AbstractRestDTO {

	private Long idCidade;
	
	private String descricao;

	private String uF;

	private String pais;
	
	public Long getIdCidade(){
		return this.idCidade;
	}

    	public void setIdCidade(Long idCidade){
        	this.idCidade = idCidade;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public String getUF(){
		return this.uF;
	}

	public void setUF(String uF){
        	this.uF = uF;
	}
	public String getPais(){
		return this.pais;
	}

	public void setPais(String pais){
        	this.pais = pais;
	}
	
}
