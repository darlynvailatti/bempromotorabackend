
package domain;


import javax.persistence.*;

import domain.EntidadeEntity;
import domain.InformacaoEntity;
import java.util.List;

 

@Entity
@Table(name = "Registro")
public class RegistroEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="registroDeInformacao_gen")
	@SequenceGenerator(name= "registroDeInformacao_gen", sequenceName="registroDeInformacao_seq", allocationSize =1)
	@Column(name = "RegistroDeInformacao", updatable = false, nullable = false)
	private Long registroDeInformacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IdEntidade")
	private EntidadeEntity entidade;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="registroDeInformacao", cascade=CascadeType.ALL)
	private List<InformacaoEntity> registroDeInformacaoInformacao;
	
    	
	

	// gets e sets
	public Long getRegistroDeInformacao(){
		return this.registroDeInformacao;
	};

    	public void setRegistroDeInformacao(Long registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	};
	
	@Override
	public Long getId(){
		return getRegistroDeInformacao();
	};
	
	public EntidadeEntity getEntidade(){
		return this.entidade;
	};

    	public void setEntidade(EntidadeEntity entidade){
        	this.entidade = entidade;
	};
	
	
	
	//novos
	
  	public List<InformacaoEntity> getRegistroDeInformacaoInformacao(){
		return this.registroDeInformacaoInformacao;
	};
	public void setRegistroDeInformacaoInformacao(List<InformacaoEntity> registroDeInformacaoInformacao ){
		this.registroDeInformacaoInformacao=registroDeInformacaoInformacao;
	}
	
    	
	
	
	
	
	
}