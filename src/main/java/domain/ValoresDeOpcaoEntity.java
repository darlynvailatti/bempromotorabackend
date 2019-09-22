
package domain;


import javax.persistence.*;

import domain.AliasEntity;
import domain.ConteudoEntity;
import java.util.List;

 

@Entity
@Table(name = "ValoresDeOpcao")
public class ValoresDeOpcaoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "ValorDeOpcao")
	private String valorDeOpcao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudo", cascade=CascadeType.ALL)
	private List<AliasEntity> conteudoAlias;
	
    	
	

	// gets e sets
	@Override
	public Long getId(){
		return getConteudo().getId();
	};
	
	
	public ConteudoEntity getConteudo(){
		return this.conteudo;
	};

    	public void setConteudo(ConteudoEntity conteudo){
        	this.conteudo = conteudo;
	};
	
	public String getValorDeOpcao(){
		return this.valorDeOpcao;
	};

	public void setValorDeOpcao(String valorDeOpcao){
        	this.valorDeOpcao = valorDeOpcao;
	};
	
	
	
	//novos
	
  	public List<AliasEntity> getConteudoAlias(){
		return this.conteudoAlias;
	};
	public void setConteudoAlias(List<AliasEntity> conteudoAlias ){
		this.conteudoAlias=conteudoAlias;
	}
	
    	
	
	
	
	
	
}