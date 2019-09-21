
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.EvolucoesDaPropostaEntity;
import modelo.PropostaEntity;

import java.util.List;

  

@Entity
@Table(name = "SituacoesDaProposta")
public class SituacoesDaPropostaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idSituacao_gen")
	@SequenceGenerator(name= "idSituacao_gen", sequenceName="idSituacao_seq", allocationSize =1)
	@Column(name = "idSituacao", updatable = false, nullable = false)
	private Long idSituacao;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="situacao", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> situacaoEvolucoesDaProposta;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="situacao", cascade=CascadeType.ALL)
	private List<PropostaEntity> situacaoProposta;
	
    	
	

	// gets e sets
	public Long getIdSituacao(){
		return this.idSituacao;
	};

    	public void setIdSituacao(Long idSituacao){
        	this.idSituacao = idSituacao;
	};
	
	@Override
	public Long getId(){
		return getIdSituacao();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	
	
	//novos
	
  	public List<EvolucoesDaPropostaEntity> getSituacaoEvolucoesDaProposta(){
		return this.situacaoEvolucoesDaProposta;
	};
	public void setSituacaoEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> situacaoEvolucoesDaProposta ){
		this.situacaoEvolucoesDaProposta=situacaoEvolucoesDaProposta;
	}
	
    	
	
  	public List<PropostaEntity> getSituacaoProposta(){
		return this.situacaoProposta;
	};
	public void setSituacaoProposta(List<PropostaEntity> situacaoProposta ){
		this.situacaoProposta=situacaoProposta;
	}
	
    	
	
	
	
	
	
}