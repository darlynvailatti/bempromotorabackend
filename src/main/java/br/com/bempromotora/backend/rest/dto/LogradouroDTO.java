
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class LogradouroDTO extends AbstractRestDTO {

	private Long idLogradouro;
	
	private LocalidadeDTO localidade;
	
	private String endereco;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private String cEP;
	
	public Long getIdLogradouro(){
		return this.idLogradouro;
	}

    	public void setIdLogradouro(Long idLogradouro){
        	this.idLogradouro = idLogradouro;
	}
	public LocalidadeDTO getLocalidade(){
		return this.localidade;
	}

    	public void setLocalidade(LocalidadeDTO localidade){
        	this.localidade = localidade;
	}
	public String getEndereco(){
		return this.endereco;
	}

	public void setEndereco(String endereco){
        	this.endereco = endereco;
	}
	public String getNumero(){
		return this.numero;
	}

	public void setNumero(String numero){
        	this.numero = numero;
	}
	public String getComplemento(){
		return this.complemento;
	}

	public void setComplemento(String complemento){
        	this.complemento = complemento;
	}
	public String getBairro(){
		return this.bairro;
	}

	public void setBairro(String bairro){
        	this.bairro = bairro;
	}
	public String getCEP(){
		return this.cEP;
	}

	public void setCEP(String cEP){
        	this.cEP = cEP;
	}
	
}
