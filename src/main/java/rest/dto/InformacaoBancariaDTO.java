
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class InformacaoBancariaDTO extends AbstractRestDTO {

	private Long idInformacaoBancaria;

	private ParceiroDTO parceiro;
	
	private String banco;

	private String agencia;

	private String conta;
	
	private String ativa;
	
	private String recebimentoOuPagamento;
	
	
	public Long getIdInformacaoBancaria(){
		return this.idInformacaoBancaria;
	}

    	public void setIdInformacaoBancaria(Long idInformacaoBancaria){
        	this.idInformacaoBancaria = idInformacaoBancaria;
	}
	public ParceiroDTO getParceiro(){
		return this.parceiro;
	}

    	public void setParceiro(ParceiroDTO parceiro){
        	this.parceiro = parceiro;
	}
	public String getBanco(){
		return this.banco;
	}

	public void setBanco(String banco){
        	this.banco = banco;
	}
	public String getAgencia(){
		return this.agencia;
	}

	public void setAgencia(String agencia){
        	this.agencia = agencia;
	}
	public String getConta(){
		return this.conta;
	}

	public void setConta(String conta){
        	this.conta = conta;
	}
	public String getAtiva(){
		return this.ativa;
	}

	public void setAtiva(String ativa){
        	this.ativa = ativa;
	}
	public String getRecebimentoOuPagamento(){
		return this.recebimentoOuPagamento;
	}

	public void setRecebimentoOuPagamento(String recebimentoOuPagamento){
        	this.recebimentoOuPagamento = recebimentoOuPagamento;
	}
	
}
