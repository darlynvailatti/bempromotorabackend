
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class ValoresDeOpcaoDTO extends AbstractRestDTO{
	private Long idConteudo;
	
	/** 
	* Valor de Op��o (ValorDeOpcao NOT NULL char(20))
	*/
	private String valorDeOpcao; 
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getValorDeOpcao(){
		return this.valorDeOpcao;
	}

	public void setValorDeOpcao(String valorDeOpcao){
        	this.valorDeOpcao = valorDeOpcao;
	}
	
}
