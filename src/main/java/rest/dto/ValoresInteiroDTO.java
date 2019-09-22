
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

/**
* Valores Inteiros "ValoresInteiro"
*/
public class ValoresInteiroDTO extends AbstractRestDTO{
	/**
	* Chave Conte�do (idConteudo) de Valores Inteiros
	*/
	private Long idConteudo;
	
	/** 
	* Inteiro (ValorInteiro NOT NULL integer)
	*/
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
