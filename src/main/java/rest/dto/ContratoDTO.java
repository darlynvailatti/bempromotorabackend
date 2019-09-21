
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class ContratoDTO extends AbstractRestDTO {

	private Long idContrato;

	private VersoesContratoDTO versao;

	
	public Long getIdContrato(){
		return this.idContrato;
	}

    	public void setIdContrato(Long idContrato){
        	this.idContrato = idContrato;
	}
	public VersoesContratoDTO getVersao(){
		return this.versao;
	}

    	public void setVersao(VersoesContratoDTO versao){
        	this.versao = versao;
	}
	
}
