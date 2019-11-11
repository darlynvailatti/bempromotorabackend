
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class ValoresInteiroDTO extends AbstractRestDTO{
	private Long idConteudo;
	
	/** 
	* NOT NULL	*/
	 private Integer valorInteiro;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public Integer getValorInteiro(){
		return this.valorInteiro;
	}

	public void setValorInteiro(Integer valorInteiro){
        	this.valorInteiro = valorInteiro;
	}
	
}
