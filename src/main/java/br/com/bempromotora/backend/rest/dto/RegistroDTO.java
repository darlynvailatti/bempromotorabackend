
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

/**
* Registros das entidades sequencial único para todas as entitades
*/
public class RegistroDTO extends AbstractRestDTO{

	private Long registroDeInformacao;
	private EntidadeDTO entidade;
	public Long getRegistroDeInformacao(){
		return this.registroDeInformacao;
	}

    	public void setRegistroDeInformacao(Long registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	}
	public EntidadeDTO getEntidade(){
		return this.entidade;
	}

    	public void setEntidade(EntidadeDTO entidade){
        	this.entidade = entidade;
	}
	
}
