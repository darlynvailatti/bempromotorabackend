
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;


public class HashSenhaDTO extends AbstractRestDTO{
	private Long idConteudo;
	private String hashSenhas; 
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getHashSenhas(){
		return this.hashSenhas;
	}

	public void setHashSenhas(String hashSenhas){
        	this.hashSenhas = hashSenhas;
	}
	
}
