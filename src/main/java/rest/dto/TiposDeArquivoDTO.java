
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class TiposDeArquivoDTO extends AbstractRestDTO {

	private Long idTipoArquivo;

	private TiposDocumentoDTO tipoDocumento;

	private String descricao;

	public Long getIdTipoArquivo(){
		return this.idTipoArquivo;
	}

    	public void setIdTipoArquivo(Long idTipoArquivo){
        	this.idTipoArquivo = idTipoArquivo;
	}
	public TiposDocumentoDTO getTipoDocumento(){
		return this.tipoDocumento;
	}

    	public void setTipoDocumento(TiposDocumentoDTO tipoDocumento){
        	this.tipoDocumento = tipoDocumento;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
}
