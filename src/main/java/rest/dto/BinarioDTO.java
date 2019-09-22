
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

/**
* Bin�rios "Binario"
*/
public class BinarioDTO extends AbstractRestDTO{
	/**
	* Chave Conte�do (idConteudo) de Bin�rios
	*/
	private Long idConteudo;
	
	/** 
	* HashBin�rio Diferencial (HashBinarioComDiferencial NOT NULL char(20))
	*/
	private String hashBinarioComDiferencial; 
	
	
	/** 
	* Binario (Binario NULL blob)
	*/
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
