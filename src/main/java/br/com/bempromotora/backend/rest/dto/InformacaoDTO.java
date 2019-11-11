package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class InformacaoDTO extends AbstractRestDTO{
	private Long idInformacao;
	private EstruturaDeRegistroDTO estrutura;
	private RegistroDTO registroDeInformacao;
	
	
	public Long getIdInformacao(){
		return this.idInformacao;
	}

    	public void setIdInformacao(Long idInformacao){
        	this.idInformacao = idInformacao;
	}
	public EstruturaDeRegistroDTO getEstrutura(){
		return this.estrutura;
	}

    	public void setEstrutura(EstruturaDeRegistroDTO estrutura){
        	this.estrutura = estrutura;
	}
	public RegistroDTO getRegistroDeInformacao(){
		return this.registroDeInformacao;
	}

    	public void setRegistroDeInformacao(RegistroDTO registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	}
	
}

