
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

public class ConveniosDoClienteDTO extends AbstractRestDTO {

	private Long idCliente;
	
	private Long idConvenio;
	
	private String matricula;
	
	private LocalDate dataEntrada;

	private LocalDate dataFim;
	
	public Long getIdCliente(){
		return this.idCliente;
	}

    	public void setIdCliente(Long idCliente){
        	this.idCliente = idCliente;
	}
	public Long getIdConvenio(){
		return this.idConvenio;
	}

    	public void setIdConvenio(Long idConvenio){
        	this.idConvenio = idConvenio;
	}
	public String getMatricula(){
		return this.matricula;
	}

	public void setMatricula(String matricula){
        	this.matricula = matricula;
	}
	public LocalDate getDataEntrada(){
		return this.dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada){
        	this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataFim(){
		return this.dataFim;
	}

	public void setDataFim(LocalDate dataFim){
        	this.dataFim = dataFim;
	}
	
}
