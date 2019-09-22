
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

public class EvolucaoPropostaDTO extends AbstractRestDTO {

	private Long idEvolucaoProposta;
	
	private UsuarioDTO usuario;
	
	private NotificacaoDTO notificacao;
	
	private SituacaoPropostaDTO situacao;
	
	 private LocalDate dataHora;

	public Long getIdEvolucaoProposta(){
		return this.idEvolucaoProposta;
	}

    	public void setIdEvolucaoProposta(Long idEvolucaoProposta){
        	this.idEvolucaoProposta = idEvolucaoProposta;
	}
	public UsuarioDTO getUsuario(){
		return this.usuario;
	}

    	public void setUsuario(UsuarioDTO usuario){
        	this.usuario = usuario;
	}
	public NotificacaoDTO getNotificacao(){
		return this.notificacao;
	}

    	public void setNotificacao(NotificacaoDTO notificacao){
        	this.notificacao = notificacao;
	}
	public SituacaoPropostaDTO getSituacao(){
		return this.situacao;
	}

    	public void setSituacao(SituacaoPropostaDTO situacao){
        	this.situacao = situacao;
	}
	public LocalDate getDataHora(){
		return this.dataHora;
	}

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	}
	
}
