
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.EntidadeDTO;

/**
* Registros das entidades sequencial único para todas as entitades
*/
public class RegistroDTO extends AbstractRestDTO{

	private Long registroDeInformacao;
	private EntidadeDTO entidade;
	public Long getRegistroDeInformacao(){
		return this.registroDeInformacao;
	}

    	public void setRegistroDeInformacao(Long registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	}
	public EntidadeDTO getEntidade(){
		return this.entidade;
	}

    	public void setEntidade(EntidadeDTO entidade){
        	this.entidade = entidade;
	}
	
}
