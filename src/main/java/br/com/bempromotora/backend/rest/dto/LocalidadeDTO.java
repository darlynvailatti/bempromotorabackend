
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class LocalidadeDTO extends AbstractRestDTO {

	private Long idLocalidade;

	private String descricao;
	
	private ParceiroDTO parceiro;

	private String residencialouComercial;
	
	private InformacaoBancariaDTO informacaoBancaria;

	public Long getIdLocalidade(){
		return this.idLocalidade;
	}

    	public void setIdLocalidade(Long idLocalidade){
        	this.idLocalidade = idLocalidade;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public ParceiroDTO getParceiro(){
		return this.parceiro;
	}

    	public void setParceiro(ParceiroDTO parceiro){
        	this.parceiro = parceiro;
	}
	public String getResidencialouComercial(){
		return this.residencialouComercial;
	}

	public void setResidencialouComercial(String residencialouComercial){
        	this.residencialouComercial = residencialouComercial;
	}
	public InformacaoBancariaDTO getInformacaoBancaria(){
		return this.informacaoBancaria;
	}

    	public void setInformacaoBancaria(InformacaoBancariaDTO informacaoBancaria){
        	this.informacaoBancaria = informacaoBancaria;
	}
	
}
