
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class NotificacaoDTO extends AbstractRestDTO {

	private Long idNotificacao;
	
	private ParceiroDTO parceiroNotificador;
	
	private String textoNotificacao;
	
	private ParceiroDTO parceiroNotificado;

	public Long getIdNotificacao(){
		return this.idNotificacao;
	}

    	public void setIdNotificacao(Long idNotificacao){
        	this.idNotificacao = idNotificacao;
	}
	public ParceiroDTO getParceiroNotificador(){
		return this.parceiroNotificador;
	}

    	public void setParceiroNotificador(ParceiroDTO parceiroNotificador){
        	this.parceiroNotificador = parceiroNotificador;
	}
	public String getTextoNotificacao(){
		return this.textoNotificacao;
	}

	public void setTextoNotificacao(String textoNotificacao){
        	this.textoNotificacao = textoNotificacao;
	}
	public ParceiroDTO getParceiroNotificado(){
		return this.parceiroNotificado;
	}

    	public void setParceiroNotificado(ParceiroDTO parceiroNotificado){
        	this.parceiroNotificado = parceiroNotificado;
	}
	
}
