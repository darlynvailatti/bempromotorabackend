
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

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
