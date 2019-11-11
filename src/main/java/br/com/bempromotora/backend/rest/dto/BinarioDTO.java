
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class BinarioDTO extends AbstractRestDTO{
	private Long idConteudo;
	private String hashBinarioComDiferencial; 
	private byte[] binario;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getHashBinarioComDiferencial(){
		return this.hashBinarioComDiferencial;
	}

	public void setHashBinarioComDiferencial(String hashBinarioComDiferencial){
        	this.hashBinarioComDiferencial = hashBinarioComDiferencial;
	}
	public byte[] getBinario(){
		return this.binario;
	}

	public void setBinario(byte[] binario){
        	this.binario = binario;
	}
	
}
