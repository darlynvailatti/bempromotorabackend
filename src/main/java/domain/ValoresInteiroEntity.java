
package domain;


import javax.persistence.*;

import domain.ConteudoEntity;
import java.util.List;
 

@Entity
@Table(name = "ValoresInteiro")
public class ValoresInteiroEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "ValorInteiro")
	private Integer valorInteiro;
	
	

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
	
	public Integer getValorInteiro(){
		return this.valorInteiro;
	};

	public void setValorInteiro(Integer valorInteiro){
        	this.valorInteiro = valorInteiro;
	};
	
	
	
	//novos
	
	
	
	
	
}