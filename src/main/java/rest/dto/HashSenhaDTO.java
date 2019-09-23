
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;


public class HashSenhaDTO extends AbstractRestDTO{
	private Long idConteudo;
	private String hashSenhas; 
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getHashSenhas(){
		return this.hashSenhas;
	}

	public void setHashSenhas(String hashSenhas){
        	this.hashSenhas = hashSenhas;
	}
	
}
