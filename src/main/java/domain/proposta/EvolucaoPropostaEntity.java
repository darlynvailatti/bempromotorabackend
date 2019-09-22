
package domain.proposta;

import domain.NotificacaoEntity;
import domain.UsuarioEntity;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "EvolucaoProposta")
public class EvolucaoPropostaEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEvolucaoProposta_gen")
	@SequenceGenerator(name= "idEvolucaoProposta_gen", sequenceName="idEvolucaoProposta_seq", allocationSize =1)
	@Column(name = "idEvolucaoProposta", updatable = false, nullable = false)
	private Long idEvolucaoProposta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private UsuarioEntity usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idNotificacao")
	private NotificacaoEntity notificacao;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idSituacao")
	private SituacaoPropostaCreditoEnum situacao;

	@Column(name = "DataHora")
	private LocalDate dataHora;
	
	public Long getIdEvolucaoProposta(){
		return this.idEvolucaoProposta;
	};

    	public void setIdEvolucaoProposta(Long idEvolucaoProposta){
        	this.idEvolucaoProposta = idEvolucaoProposta;
	};
	
	@Override
	public Long getId(){
		return getIdEvolucaoProposta();
	};
	
	public UsuarioEntity getUsuario(){
		return this.usuario;
	};

    	public void setUsuario(UsuarioEntity usuario){
        	this.usuario = usuario;
	};
	
	public NotificacaoEntity getNotificacao(){
		return this.notificacao;
	};

    	public void setNotificacao(NotificacaoEntity notificacao){
        	this.notificacao = notificacao;
	};
	
	public SituacaoPropostaCreditoEnum getSituacao(){
		return this.situacao;
	};

    	public void setSituacao(SituacaoPropostaCreditoEnum situacao){
        	this.situacao = situacao;
	};
	
	public LocalDate getDataHora(){
		return this.dataHora;
	};

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	};
	
	
	
	//novos
	
	
	
	
	
}