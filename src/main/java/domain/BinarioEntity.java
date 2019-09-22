
package domain;


import javax.persistence.*;

import domain.ConteudoEntity;
 

@Entity
@Table(name = "Binario")
public class BinarioEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "HashBinarioComDiferencial")
	private String hashBinarioComDiferencial;
	
	@Column(name = "Binario")
	private byte[] binario;
	
	

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
	
	public String getHashBinarioComDiferencial(){
		return this.hashBinarioComDiferencial;
	};

	public void setHashBinarioComDiferencial(String hashBinarioComDiferencial){
        	this.hashBinarioComDiferencial = hashBinarioComDiferencial;
	};
	
	public byte[] getBinario(){
		return this.binario;
	};

	public void setBinario(byte[] binario){
        	this.binario = binario;
	};
	
	
	
	//novos
	
	
	
	
	
}