package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

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
