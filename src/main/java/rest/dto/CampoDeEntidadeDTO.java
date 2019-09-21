
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class CampoDeEntidadeDTO extends AbstractRestDTO {

	private Long idCampo;
	
	private EntidadeDTO tidade;
	
	
	private String descri��o;
	
	private String tamanho_Maximo_Inteiro;
	
	private String tamano_Minimo_Inteiro;
	
	private String tamanho_Decimais;
	
	
	private String aceita_Nulo_S_N;
	
	
	private String auto_Incremento_S_N;
	
	private CampoDeEntidadeDTO mpo_Chave_Extrangeira;
	
	private ConteudoDTO contunte_Default;
	
	
	public Long getIdCampo(){
		return this.idCampo;
	}

    	public void setIdCampo(Long idCampo){
        	this.idCampo = idCampo;
	}
	public EntidadeDTO getTidade(){
		return this.tidade;
	}

    	public void setTidade(EntidadeDTO tidade){
        	this.tidade = tidade;
	}
	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	}
	public String getTamanho_Maximo_Inteiro(){
		return this.tamanho_Maximo_Inteiro;
	}

	public void setTamanho_Maximo_Inteiro(String tamanho_Maximo_Inteiro){
        	this.tamanho_Maximo_Inteiro = tamanho_Maximo_Inteiro;
	}
	public String getTamano_Minimo_Inteiro(){
		return this.tamano_Minimo_Inteiro;
	}

	public void setTamano_Minimo_Inteiro(String tamano_M�nimo_Inteiro){
        	this.tamano_M�nimo_Inteiro = tamano_M�nimo_Inteiro;
	}
	public String getTamanho_Decimais(){
		return this.tamanho_Decimais;
	}

	public void setTamanho_Decimais(String tamanho_Decimais){
        	this.tamanho_Decimais = tamanho_Decimais;
	}
	public String getAceita_Nulo_S_N(){
		return this.aceita_Nulo_S_N;
	}

	public void setAceita_Nulo_S_N(String aceita_Nulo_S_N){
        	this.aceita_Nulo_S_N = aceita_Nulo_S_N;
	}
	public String getAuto_Incremento_S_N(){
		return this.auto_Incremento_S_N;
	}

	public void setAuto_Incremento_S_N(String auto_Incremento_S_N){
        	this.auto_Incremento_S_N = auto_Incremento_S_N;
	}
	public CampoDeEntidadeDTO getMpo_Chave_Extrangeira(){
		return this.mpo_Chave_Extrangeira;
	}

    	public void setMpo_Chave_Extrangeira(CampoDeEntidadeDTO mpo_Chave_Extrangeira){
        	this.mpo_Chave_Extrangeira = mpo_Chave_Extrangeira;
	}
	public Conte�doDTO getNte�do_Default(){
		return this.nte�do_Default;
	}

    	public void setNte�do_Default(Conte�doDTO nte�do_Default){
        	this.nte�do_Default = nte�do_Default;
	}
	
}
