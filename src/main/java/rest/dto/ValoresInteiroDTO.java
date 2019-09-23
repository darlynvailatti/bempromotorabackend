
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

public class ValoresInteiroDTO extends AbstractRestDTO{
	private Long idConteudo;
	
	/** 
	* NOT NULL	*/
	 private Integer valorInteiro;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public Integer getValorInteiro(){
		return this.valorInteiro;
	}

	public void setValorInteiro(Integer valorInteiro){
        	this.valorInteiro = valorInteiro;
	}
	
}
