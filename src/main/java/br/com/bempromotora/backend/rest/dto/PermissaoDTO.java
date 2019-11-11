
package br.com.bempromotora.backend.rest.dto;


import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

public class PermissaoDTO extends AbstractRestDTO{
	private Long idPermissao;
	/**
	* Usu�rio (Conteudos.idUsuario NOT NULL) Conte�dos
	*/
	private ConteudoDTO usuario;
	
	public Long getIdPermissao(){
		return this.idPermissao;
	}

    	public void setIdPermissao(Long idPermissao){
        	this.idPermissao = idPermissao;
	}
	public ConteudoDTO getUsuario(){
		return this.usuario;
	}

    	public void setUsuario(ConteudoDTO usuario){
        	this.usuario = usuario;
	}
	
}
