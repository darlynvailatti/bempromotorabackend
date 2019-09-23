
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

public class ValoresDeOpcaoDTO extends AbstractRestDTO{
	private Long idConteudo;
	
	/** 
	* Valor de Op��o (ValorDeOpcao NOT NULL char(20))
	*/
	private String valorDeOpcao; 
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public String getValorDeOpcao(){
		return this.valorDeOpcao;
	}

	public void setValorDeOpcao(String valorDeOpcao){
        	this.valorDeOpcao = valorDeOpcao;
	}
	
}
