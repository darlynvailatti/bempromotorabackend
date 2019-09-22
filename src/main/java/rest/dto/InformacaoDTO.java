package rest.dto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.EstruturaDeRegistroDTO;
import rest.dto.RegistroDTO;
import rest.pattern.AbstractRestDTO;
import rest.dto.ConteudoDTO;

public class InformacaoDTO extends AbstractRestDTO{
	private Long idInformacao;
	private EstruturaDeRegistroDTO estrutura;
	private RegistroDTO registroDeInformacao;
	
	
	public Long getIdInformacao(){
		return this.idInformacao;
	}

    	public void setIdInformacao(Long idInformacao){
        	this.idInformacao = idInformacao;
	}
	public EstruturaDeRegistroDTO getEstrutura(){
		return this.estrutura;
	}

    	public void setEstrutura(EstruturaDeRegistroDTO estrutura){
        	this.estrutura = estrutura;
	}
	public RegistroDTO getRegistroDeInformacao(){
		return this.registroDeInformacao;
	}

    	public void setRegistroDeInformacao(RegistroDTO registroDeInformacao){
        	this.registroDeInformacao = registroDeInformacao;
	}
	
}

