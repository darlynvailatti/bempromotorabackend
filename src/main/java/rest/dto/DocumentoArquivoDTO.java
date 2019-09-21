
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class DocumentoArquivoDTO extends AbstractRestDTO {

	private Long idArquivo;
	
	private DocumentoDTO documento;

	public Long getIdArquivo(){
		return this.idArquivo;
	}

    	public void setIdArquivo(Long idArquivo){
        	this.idArquivo = idArquivo;
	}
	public DocumentoDTO getDocumento(){
		return this.documento;
	}

    	public void setDocumento(DocumentoDTO documento){
        	this.documento = documento;
	}
	
}
