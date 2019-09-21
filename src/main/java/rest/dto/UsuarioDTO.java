
package rest.dto;

import rest.pattern.AbstractRestDTO;

public class UsuarioDTO extends AbstractRestDTO {

	private Long idUsuario;

	private String senha;

	private String ativo;

	public Long getIdUsuario(){
		return this.idUsuario;
	}

    	public void setIdUsuario(Long idUsuario){
        	this.idUsuario = idUsuario;
	}
	public String getSenha(){
		return this.senha;
	}

	public void setSenha(String senha){
        	this.senha = senha;
	}
	public String getAtivo(){
		return this.ativo;
	}

	public void setAtivo(String ativo){
        	this.ativo = ativo;
	}
	
}
