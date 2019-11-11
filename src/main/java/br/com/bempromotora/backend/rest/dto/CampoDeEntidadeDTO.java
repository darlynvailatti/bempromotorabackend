
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class CampoDeEntidadeDTO extends AbstractRestDTO {

	private Long idCampo;
	
	private EntidadeDTO tidade;
	
	private String descricao;
	
	private String tamanhoMaximoInteiro;
	
	private String tamanoMinimoInteiro;
	
	private String tamanhoDecimais;
	
	private String aceitaNulo;
	
	private String autoIncremento;
	
	private CampoDeEntidadeDTO campoChaveExtrangeira;
	
	private ConteudoCampoEntidadeDTO conteudo;

	public Long getIdCampo() {
		return idCampo;
	}

	public void setIdCampo(Long idCampo) {
		this.idCampo = idCampo;
	}

	public EntidadeDTO getTidade() {
		return tidade;
	}

	public void setTidade(EntidadeDTO tidade) {
		this.tidade = tidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTamanhoMaximoInteiro() {
		return tamanhoMaximoInteiro;
	}

	public void setTamanhoMaximoInteiro(String tamanhoMaximoInteiro) {
		this.tamanhoMaximoInteiro = tamanhoMaximoInteiro;
	}

	public String getTamanoMinimoInteiro() {
		return tamanoMinimoInteiro;
	}

	public void setTamanoMinimoInteiro(String tamanoMinimoInteiro) {
		this.tamanoMinimoInteiro = tamanoMinimoInteiro;
	}

	public String getTamanhoDecimais() {
		return tamanhoDecimais;
	}

	public void setTamanhoDecimais(String tamanhoDecimais) {
		this.tamanhoDecimais = tamanhoDecimais;
	}

	public String getAceitaNulo() {
		return aceitaNulo;
	}

	public void setAceitaNulo(String aceitaNulo) {
		this.aceitaNulo = aceitaNulo;
	}

	public String getAutoIncremento() {
		return autoIncremento;
	}

	public void setAutoIncremento(String autoIncremento) {
		this.autoIncremento = autoIncremento;
	}

	public CampoDeEntidadeDTO getCampoChaveExtrangeira() {
		return campoChaveExtrangeira;
	}

	public void setCampoChaveExtrangeira(CampoDeEntidadeDTO campoChaveExtrangeira) {
		this.campoChaveExtrangeira = campoChaveExtrangeira;
	}

	public ConteudoCampoEntidadeDTO getConteudo() {
		return conteudo;
	}

	public void setConteudo(ConteudoCampoEntidadeDTO conteudo) {
		this.conteudo = conteudo;
	}
}
