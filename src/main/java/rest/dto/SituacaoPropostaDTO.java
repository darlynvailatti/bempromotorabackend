
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class SituacaoPropostaDTO extends AbstractRestDTO {

	private Long idSituacao;
	
	private String descricao;
	
	public Long getIdSituacao(){
		return this.idSituacao;
	}

    	public void setIdSituacao(Long idSituacao){
        	this.idSituacao = idSituacao;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	
}
