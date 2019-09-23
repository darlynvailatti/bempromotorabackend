
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;
import rest.dto.CampoDeEntidadeDTO;

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
