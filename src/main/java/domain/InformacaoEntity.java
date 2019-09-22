
package domain;


import javax.persistence.*;

import domain.EstruturaDeRegistroEntity;
import domain.LogEntity;
import domain.RegistroEntity;
import domain.proposta.regra.RegraEntity;
import java.util.List;

 

@Entity
@Table(name = "Informacao")
public class InformacaoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idInformacao_gen")
	@SequenceGenerator(name= "idInformacao_gen", sequenceName="idInformacao_seq", allocationSize =1)
	@Column(name = "idInformacao", updatable = false, nullable = false)
	private Long idInformacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEstrutura")
	private EstruturaDeRegistroEntity estrutura;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idRegistroDeInformacao")
	private RegistroEntity registroDeInformacao;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="informacao", cascade=CascadeType.ALL)
	private List<LogEntity> informacaoLog;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="informacaoComparacao", cascade=CascadeType.ALL)
	private List<RegraEntity> informacaoComparacaoRegra;
	
    	
	

	// gets e sets
	public Long getIdInformacao(){
		return this.idInformacao;
	};

    	public void setIdInformacao(Long idInformacao){
        	this.idInformacao = idInformacao;
	};
	
	@Override
	public Long getId(){
		return getIdInformacao();
	};
	
	public EstruturaDeRegistroEntity getEstrutura(){
		return this.estrutura;
	};

    	public void setEstrutura(EstruturaDeRegistroEntity estrutura){
        	this.estrutura = estrutura;
	};
	
	public RegistroEntity getRegistroDeInformacao(){
		return this.registroDeInformacao;
	};

    	public void setRegistroDeInformacao(RegistroEntity registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	};
	
	
	
	//novos
	
  	public List<LogEntity> getInformacaoLog(){
		return this.informacaoLog;
	};
	public void setInformacaoLog(List<LogEntity> informacaoLog ){
		this.informacaoLog=informacaoLog;
	}
	
    	
	
  	public List<RegraEntity> getInformacaoComparacaoRegra(){
		return this.informacaoComparacaoRegra;
	};
	public void setInformacaoComparacaoRegra(List<RegraEntity> informacaoComparacaoRegra ){
		this.informacaoComparacaoRegra=informacaoComparacaoRegra;
	}
	
    	
	
	
	
	
	
}