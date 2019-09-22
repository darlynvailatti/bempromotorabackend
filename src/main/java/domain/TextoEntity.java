
package domain;


import javax.persistence.*;

import domain.ConteudoEntity;
import java.util.List;
 

@Entity
@Table(name = "Texto")
public class TextoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "HashTextoComDiferencial")
	private String hashTextoComDiferencial;
	
	@Column(name = "Texto")
	private String texto;
	
	

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
	
	public String getHashTextoComDiferencial(){
		return this.hashTextoComDiferencial;
	};

	public void setHashTextoComDiferencial(String hashTextoComDiferencial){
        	this.hashTextoComDiferencial = hashTextoComDiferencial;
	};
	
	public String getTexto(){
		return this.texto;
	};

	public void setTexto(String texto){
        	this.texto = texto;
	};
	
	
	
	//novos
	
	
	
	
	
}