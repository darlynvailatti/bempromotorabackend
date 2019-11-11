
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;


public class AliasDTO extends AbstractRestDTO{
	private Long idAlias;
	private ValoresDeOpcaoDTO conteudo;
	private OpcaoDeCampoDTO opcao;
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
