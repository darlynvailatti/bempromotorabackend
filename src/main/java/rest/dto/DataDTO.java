
package rest.dto;

import java.time.LocalDate;
import rest.pattern.AbstractRestDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.ConteudoDTO;

/**
* Data "Data"
*/
public class DataDTO extends AbstractRestDTO{
	/**
	* Chave Conte�do (idConteudo) de Data
	*/
	private Long idConteudo;
	
	/** 
	* Data (DataHora NOT NULL date)
	*/
	 private LocalDate dataHora;
	
	
	public Long getIdConteudo(){
		return this.idConteudo;
	}

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	}
	public LocalDate getDataHora(){
		return this.dataHora;
	}

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	}
	
}
