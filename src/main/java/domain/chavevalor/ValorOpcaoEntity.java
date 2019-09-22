
package domain.chavevalor;


import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "ValoreOpcao")
public class ValorOpcaoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	private ConteudoEntity conteudo;

	@Column(name = "ValorDeOpcao")
	private String valorDeOpcao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudo", cascade=CascadeType.ALL)
	private Set<AliasEntity> aliases;
	
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
	
  	public Set<AliasEntity> getAliases(){
		return this.aliases;
	};
	public void setAliases(Set<AliasEntity> aliases){
		this.aliases = aliases;
	}

}