
package br.com.bempromotora.backend.rest.dto;

import java.time.LocalDate;
import br.com.bempromotora.backend.rest.pattern.AbstractRestDTO;

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
