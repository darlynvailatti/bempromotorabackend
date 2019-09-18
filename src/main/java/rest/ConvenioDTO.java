
package rest;

import arquitetura.rest.AbstractRestDTO;

public class ConvenioDTO extends AbstractRestDTO {

	private Long idConvenio;
	
	private String descricao;
	
	
	public Long getIdConvenio(){
		return this.idConvenio;
	}

    	public void setIdConvenio(Long idConvenio){
        	this.idConvenio = idConvenio;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
}
