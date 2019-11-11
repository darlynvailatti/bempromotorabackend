
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class TipoArquivoDTO extends AbstractRestDTO {

	private Long idTipoArquivo;

	private TipoDocumentoDTO tipoDocumento;

	private String descricao;

	public Long getIdTipoArquivo(){
		return this.idTipoArquivo;
	}

    	public void setIdTipoArquivo(Long idTipoArquivo){
        	this.idTipoArquivo = idTipoArquivo;
	}
	public TipoDocumentoDTO getTipoDocumento(){
		return this.tipoDocumento;
	}

    	public void setTipoDocumento(TipoDocumentoDTO tipoDocumento){
        	this.tipoDocumento = tipoDocumento;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
}
