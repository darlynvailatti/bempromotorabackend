
package rest.dto;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.pattern.AbstractRestDTO;
/**
* Conte�dos "Conteudo"
*/
public class ConteudoDTO extends AbstractRestDTO{
	/**
	* Chave Conte�do (idConteudo) de Conte�dos
	*/
	private Long idConteudo;
	
	/** 
	* Hash Conte�do (HashBase NULL char(20))
	*/
	private String hashBase; 
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getHashBase(){
		return this.hashBase;
	}

	public void setHashBase(String hashBase){
        	this.hashBase = hashBase;
	}
	
}
