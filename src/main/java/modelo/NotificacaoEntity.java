
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.EvolucoesDaPropostaEntity;
import modelo.ParceiroEntity;

import java.util.List;

 

@Entity
@Table(name = "Notificacao")
public class NotificacaoEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idNotificacao_gen")
	@SequenceGenerator(name= "idNotificacao_gen", sequenceName="idNotificacao_seq", allocationSize =1)
	@Column(name = "idNotificacao", updatable = false, nullable = false)
	private Long idNotificacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiroNotificador")
	private ParceiroEntity parceiroNotificador;
	@Column(name = "TextoNotificacao")
	private String textoNotificacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiroNotificado")
	private ParceiroEntity parceiroNotificado;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="notificacao", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> notificacaoEvolucoesDaProposta;
	
    	
	

	// gets e sets
	public Long getIdNotificacao(){
		return this.idNotificacao;
	};

    	public void setIdNotificacao(Long idNotificacao){
        	this.idNotificacao = idNotificacao;
	};
	
	@Override
	public Long getId(){
		return getIdNotificacao();
	};
	
	public ParceiroEntity getParceiroNotificador(){
		return this.parceiroNotificador;
	};

    	public void setParceiroNotificador(ParceiroEntity parceiroNotificador){
        	this.parceiroNotificador = parceiroNotificador;
	};
	
	public String getTextoNotificacao(){
		return this.textoNotificacao;
	};

	public void setTextoNotificacao(String textoNotificacao){
        	this.textoNotificacao = textoNotificacao;
	};
	
	public ParceiroEntity getParceiroNotificado(){
		return this.parceiroNotificado;
	};

    	public void setParceiroNotificado(ParceiroEntity parceiroNotificado){
        	this.parceiroNotificado = parceiroNotificado;
	};
	
	
	
	//novos
	
  	public List<EvolucoesDaPropostaEntity> getNotificacaoEvolucoesDaProposta(){
		return this.notificacaoEvolucoesDaProposta;
	};
	public void setNotificacaoEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> notificacaoEvolucoesDaProposta ){
		this.notificacaoEvolucoesDaProposta=notificacaoEvolucoesDaProposta;
	}
	
    	
	
	
	
	
	
}