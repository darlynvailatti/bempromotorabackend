
package rest.dto;

import java.time.LocalDate;
import rest.pattern.AbstractRestDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.PermissaoDTO;
import rest.dto.InformacaoDTO;

public class LogDTO extends AbstractRestDTO{

	private Long idLog;
	private PermissaoDTO permissao;
	private LocalDate dataHora;
	private String codigoDaTransacao; 
	
	
	public Long getIdLog(){
		return this.idLog;
	}

    	public void setIdLog(Long idLog){
        	this.idLog = idLog;
	}
	public PermissaoDTO getPermissao(){
		return this.permissao;
	}

    	public void setPermissao(PermissaoDTO permissao){
        	this.permissao = permissao;
	}
	public LocalDate getDataHora(){
		return this.dataHora;
	}

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	}
	public String getCodigoDaTransacao(){
		return this.codigoDaTransacao;
	}

	public void setCodigoDaTransacao(String codigoDaTransacao){
        	this.codigoDaTransacao = codigoDaTransacao;
	}
	
}
