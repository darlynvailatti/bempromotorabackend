
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;


public class OpcaoDeCampoDTO extends AbstractRestDTO{
	
	private Long idOpcao;
	
	private CampoDeEntidadeDTO campo;
	
	
	private String nomeLogico; 
	
	
	public Long getIdOpcao(){
		return this.idOpcao;
	}

    	public void setIdOpcao(Long idOpcao){
        	this.idOpcao = idOpcao;
	}
	public CampoDeEntidadeDTO getCampo(){
		return this.campo;
	}

    	public void setCampo(CampoDeEntidadeDTO campo){
        	this.campo = campo;
	}
	public String getNomeLogico(){
		return this.nomeLogico;
	}

	public void setNomeLogico(String nomeLogico){
        	this.nomeLogico = nomeLogico;
	}
	
}
