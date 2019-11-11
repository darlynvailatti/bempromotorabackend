
package br.com.bempromotora.backend.rest.dto;

import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class PessoasFisicaDTO extends AbstractRestDTO {

	private Long idParceiro;
	
	private String cPF;

	private String funcionrio;
	
	private PessoaJuridicaDTO funcionarioDeRepresentante;
	
	
	public Long getIdParceiro(){
		return this.idParceiro;
	}

    	public void setIdParceiro(Long idParceiro){
        	this.idParceiro = idParceiro;
	}
	public String getCPF(){
		return this.cPF;
	}

	public void setCPF(String cPF){
        	this.cPF = cPF;
	}
	public String getFuncionrio(){
		return this.funcionrio;
	}

	public void setFuncionrio(String funcionrio){
        	this.funcionrio = funcionrio;
	}
	public PessoaJuridicaDTO getFuncionarioDeRepresentante(){
		return this.funcionarioDeRepresentante;
	}

    	public void setFuncionarioDeRepresentante(PessoaJuridicaDTO funcionarioDeRepresentante){
        	this.funcionarioDeRepresentante = funcionarioDeRepresentante;
	}
	
}
