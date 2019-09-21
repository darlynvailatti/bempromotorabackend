
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class PropostaArquivoDTO extends AbstractRestDTO {

	private Long idArquivo;
	
	private PropostaDTO proposta;

	public Long getIdArquivo(){
		return this.idArquivo;
	}

    	public void setIdArquivo(Long idArquivo){
        	this.idArquivo = idArquivo;
	}
	public PropostaDTO getProposta(){
		return this.proposta;
	}

    	public void setProposta(PropostaDTO proposta){
        	this.proposta = proposta;
	}
	
}
