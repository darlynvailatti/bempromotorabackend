
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

/**
* Clientes "Cliente"
*/
public class ClienteDTO extends AbstractRestDTO {
	/**
	* Chave Cliente (idCliente) de Clientes
	*/
	private Long idCliente;
	
	/** 
	* Nome (Nome NOT NULL varchar(100))
	*/
	private String nome; 
	
	
	/** 
	* Data de Nascimento (DataNascimento NOT NULL date)
	*/
	 private LocalDate dataNascimento;
	
	
	/** 
	* Bloqueado S/N (Bloqueado NULL char(1))
	*/
	private String bloqueado; 
	
	
	public Long getIdCliente(){
		return this.idCliente;
	}

    	public void setIdCliente(Long idCliente){
        	this.idCliente = idCliente;
	}
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
        	this.nome = nome;
	}
	public LocalDate getDataNascimento(){
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento){
        	this.dataNascimento = dataNascimento;
	}
	public String getBloqueado(){
		return this.bloqueado;
	}

	public void setBloqueado(String bloqueado){
        	this.bloqueado = bloqueado;
	}
	
}
