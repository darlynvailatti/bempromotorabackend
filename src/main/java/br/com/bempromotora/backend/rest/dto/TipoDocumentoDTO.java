
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class TipoDocumentoDTO extends AbstractRestDTO {

	private Long idTipoDocumento;

	private String descricao;

	public Long getIdTipoDocumento(){
		return this.idTipoDocumento;
	}

    	public void setIdTipoDocumento(Long idTipoDocumento){
        	this.idTipoDocumento = idTipoDocumento;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
}
