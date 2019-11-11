
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class RegraDTO extends AbstractRestDTO {

	private Long idRegra;
	
	private ModeloRegrasPropostaDTO modelodeRegra;

	private String descricao;
	
	private String operadorComparacao;

	private InformacaoDTO informacaoComparacao;

	public Long getIdRegra(){
		return this.idRegra;
	}

    	public void setIdRegra(Long idRegra){
        	this.idRegra = idRegra;
	}
	public ModeloRegrasPropostaDTO getModelodeRegra(){
		return this.modelodeRegra;
	}

    	public void setModelodeRegra(ModeloRegrasPropostaDTO modelodeRegra){
        	this.modelodeRegra = modelodeRegra;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public String getOperadorComparacao(){
		return this.operadorComparacao;
	}

	public void setOperadorComparacao(String operadorComparacao){
        	this.operadorComparacao = operadorComparacao;
	}
	public InformacaoDTO getInformacaoComparacao(){
		return this.informacaoComparacao;
	}

    	public void setInformacaoComparacao(InformacaoDTO informacaoComparacao){
        	this.informacaoComparacao = informacaoComparacao;
	}
	
}
