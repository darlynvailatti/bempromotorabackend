
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class TextoContratoDTO extends AbstractRestDTO {

	private Long versaoModelo;
	
	private Long clausula;

	private String ordem;

	public Long getVersaoModelo(){
		return this.versaoModelo;
	}

    	public void setVersaoModelo(Long versaoModelo){
        	this.versaoModelo = versaoModelo;
	}
	public Long getClausula(){
		return this.clausula;
	}

    	public void setClausula(Long clausula){
        	this.clausula = clausula;
	}
	public String getOrdem(){
		return this.ordem;
	}

	public void setOrdem(String ordem){
        	this.ordem = ordem;
	}
	
}
