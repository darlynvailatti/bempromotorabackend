
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class ContratoDTO extends AbstractRestDTO {

	private Long idContrato;

	private VersaoContratoDTO versao;

	
	public Long getIdContrato(){
		return this.idContrato;
	}

    	public void setIdContrato(Long idContrato){
        	this.idContrato = idContrato;
	}
	public VersaoContratoDTO getVersao(){
		return this.versao;
	}

    	public void setVersao(VersaoContratoDTO versao){
        	this.versao = versao;
	}
	
}
