
package rest.dto;


import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

public class DocumentoDTO extends AbstractRestDTO {

	private Long idDocumento;
	
	private ParceiroDTO parceiro;

	private String orgaoEmissor;
	
	 private LocalDate data;
	
	private String codigoDocumento;
	
	
	public Long getIdDocumento(){
		return this.idDocumento;
	}

    	public void setIdDocumento(Long idDocumento){
        	this.idDocumento = idDocumento;
	}
	public ParceiroDTO getParceiro(){
		return this.parceiro;
	}

    	public void setParceiro(ParceiroDTO parceiro){
        	this.parceiro = parceiro;
	}
	public String getOrgaoEmissor(){
		return this.orgaoEmissor;
	}

	public void setOrgaoEmissor(String orgaoEmissor){
        	this.orgaoEmissor = orgaoEmissor;
	}
	public LocalDate getData(){
		return this.data;
	}

	public void setData(LocalDate data){
        	this.data = data;
	}
	public String getCodigoDocumento(){
		return this.codigoDocumento;
	}

	public void setCodigoDocumento(String codigoDocumento){
        	this.codigoDocumento = codigoDocumento;
	}
	
}
