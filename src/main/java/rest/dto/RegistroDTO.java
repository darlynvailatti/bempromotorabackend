
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class RegistroDTO extends AbstractRestDTO {

	private Long registro_de_Informa��o;
	
	private EntidadeDTO tidade;

	public Long getRegistro_de_Informa��o(){
		return this.registro_de_Informa��o;
	}

    	public void setRegistro_de_Informa��o(Long registro_de_Informa��o){
        	this.registro_de_Informa��o = registro_de_Informa��o;
	}
	public EntidadeDTO getTidade(){
		return this.tidade;
	}

    	public void setTidade(EntidadeDTO tidade){
        	this.tidade = tidade;
	}
	
}
