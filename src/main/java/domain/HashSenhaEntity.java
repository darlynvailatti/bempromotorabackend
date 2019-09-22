
package domain;


import javax.persistence.*;

import domain.ConteudoEntity;
 

@Entity
@Table(name = "HashSenha")
public class HashSenhaEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "HashSenhas")
	private String hashSenhas;
	
	

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
	
	public String getHashSenhas(){
		return this.hashSenhas;
	};

	public void setHashSenhas(String hashSenhas){
        	this.hashSenhas = hashSenhas;
	};
	
	
	
	//novos
	
	
	
	
	
}