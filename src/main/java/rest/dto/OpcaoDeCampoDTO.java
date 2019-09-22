
package rest.dto;


import org.springframework.data.domain.Page;
import rest.pattern.AbstractRestDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.CampoDeEntidadeDTO;
import rest.dto.ConteudoDTO;


public class OpcaoDeCampoDTO extends AbstractRestDTO{
	
	private Long idOpcao;
	
	private CampoDeEntidadeDTO campo;
	
	
	private String nomeLogico; 
	
	
	public Long getIdOpcao(){
		return this.idOpcao;
	}

    	public void setIdOpcao(Long idOpcao){
        	this.idOpcao = idOpcao;
	}
	public CampoDeEntidadeDTO getCampo(){
		return this.campo;
	}

    	public void setCampo(CampoDeEntidadeDTO campo){
        	this.campo = campo;
	}
	public String getNomeLogico(){
		return this.nomeLogico;
	}

	public void setNomeLogico(String nomeLogico){
        	this.nomeLogico = nomeLogico;
	}
	
}
