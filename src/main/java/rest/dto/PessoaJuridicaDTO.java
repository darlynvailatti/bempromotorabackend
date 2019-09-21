
package rest.dto;


import rest.pattern.AbstractRestDTO;

public class PessoaJuridicaDTO extends AbstractRestDTO {

	private Long parceiro;

	private String cNPJ;
	
	private String razaoSocial;
	
	private String representante;

	public Long getParceiro(){
		return this.parceiro;
	}

    	public void setParceiro(Long parceiro){
        	this.parceiro = parceiro;
	}
	public String getCNPJ(){
		return this.cNPJ;
	}

	public void setCNPJ(String cNPJ){
        	this.cNPJ = cNPJ;
	}
	public String getRazaoSocial(){
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial){
        	this.razaoSocial = razaoSocial;
	}
	public String getRepresentante(){
		return this.representante;
	}

	public void setRepresentante(String representante){
        	this.representante = representante;
	}
	
}
