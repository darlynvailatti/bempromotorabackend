package rest.dto;

import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public class EntidadeDTO extends AbstractRestDTO{
	private Long idEntidade;
	private String descricao; 
	private Integer quantidadeDeRegistros;
	
	
	public Long getIdEntidade(){
		return this.idEntidade;
	}

    	public void setIdEntidade(Long idEntidade){
        	this.idEntidade = idEntidade;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public Integer getQuantidadeDeRegistros(){
		return this.quantidadeDeRegistros;
	}

	public void setQuantidadeDeRegistros(Integer quantidadeDeRegistros){
        	this.quantidadeDeRegistros = quantidadeDeRegistros;
	}
	
}
