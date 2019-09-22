
package rest.dto;


import org.springframework.data.domain.Page;

import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ValoresDeOpcaoDTO;
import rest.dto.OpcaoDeCampoDTO;
import rest.dto.CampoDeEntidadeDTO;

/**
* Alias "Alias"
*/
public class AliasDTO extends AbstractRestDTO{
	/**
	* Chave Alias (idAlias) de Alias
	*/
	private Long idAlias;
	
	/**
	* Conte�do (ValoresDeOpcao.idConteudo NULL) Conte�dos
	*/
	private ValoresDeOpcaoDTO conteudo;
	
	
	/**
	* Op��o (OpcaoDeCampo.idOpcao NULL) Op��es de um Campo
	*/
	private OpcaoDeCampoDTO opcao;
	
	
	/** 
	* Nome resumido (NomeResumido NOT NULL char(30))
	*/
	private String nomeResumido; 
	
	
	public Long getIdAlias(){
		return this.idAlias;
	}

    	public void setIdAlias(Long idAlias){
        	this.idAlias = idAlias;
	}
	public ValoresDeOpcaoDTO getConteudo(){
		return this.conteudo;
	}

    	public void setConteudo(ValoresDeOpcaoDTO conteudo){
        	this.conteudo = conteudo;
	}
	public OpcaoDeCampoDTO getOpcao(){
		return this.opcao;
	}

    	public void setOpcao(OpcaoDeCampoDTO opcao){
        	this.opcao = opcao;
	}
	public String getNomeResumido(){
		return this.nomeResumido;
	}

	public void setNomeResumido(String nomeResumido){
        	this.nomeResumido = nomeResumido;
	}
	
}
