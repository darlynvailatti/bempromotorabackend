
package rest.dto;

import java.time.LocalDate;
import rest.pattern.AbstractRestDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rest.dto.CampoDeEntidadeDTO;
import rest.dto.EstruturaDeRegistroDTO;
import rest.dto.CampoDeEntidadeDTO;
import rest.dto.EntidadeDTO;

/**
* Estrutura de Registros "EstruturaDeRegistro"
*/
public class EstruturaDeRegistroDTO extends AbstractRestDTO{
	/**
	* Chave Estrutura (idEstrutura) de Estrutura de Registros
	*/
	private Long idEstrutura;
	
	/**
	* Entidade (Entidades.Entidade NOT NULL) Entidades
	*/
	private EntidadeDTO tidade;
	
	
	/**
	* Campo (CampoDeEntidade.Campo NOT NULL) Campos de Entidades
	*/
	private CampoDeEntidadeDTO mpo;
	
	
	/** 
	* Data Inicio (DataInicio NOT NULL date)
	*/
	 private LocalDate dataInicio;
	
	
	/** 
	* Data Fim Vigencia (DataFimVigencia NOT NULL date)
	*/
	 private LocalDate dataFimVigencia;
	
	
	/**
	* Estrutura Pai (EstruturaDeRegistro.idEstruturaPai NULL) Estrutura de Registros
	*/
	private EstruturaDeRegistroDTO estruturaPai;
	
	
	/**
	* Campo p�s Vig�ncia (CampoDeEntidade.idCampoPosVigencia NULL) Campos de Entidades
	*/
	private CampoDeEntidadeDTO campoPosVigencia;
	
	
	/** 
	* Criar Log? (CriarLogSN NULL char(1))
	*/
	private String criarLogSN; 
	
	
	public Long getIdEstrutura(){
		return this.idEstrutura;
	}

    	public void setIdEstrutura(Long idEstrutura){
        	this.idEstrutura = idEstrutura;
	}
	public EntidadeDTO getTidade(){
		return this.tidade;
	}

    	public void setTidade(EntidadeDTO tidade){
        	this.tidade = tidade;
	}
	public CampoDeEntidadeDTO getMpo(){
		return this.mpo;
	}

    	public void setMpo(CampoDeEntidadeDTO mpo){
        	this.mpo = mpo;
	}
	public LocalDate getDataInicio(){
		return this.dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio){
        	this.dataInicio = dataInicio;
	}
	public LocalDate getDataFimVigencia(){
		return this.dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDate dataFimVigencia){
        	this.dataFimVigencia = dataFimVigencia;
	}
	public EstruturaDeRegistroDTO getEstruturaPai(){
		return this.estruturaPai;
	}

    	public void setEstruturaPai(EstruturaDeRegistroDTO estruturaPai){
        	this.estruturaPai = estruturaPai;
	}
	public CampoDeEntidadeDTO getCampoPosVigencia(){
		return this.campoPosVigencia;
	}

    	public void setCampoPosVigencia(CampoDeEntidadeDTO campoPosVigencia){
        	this.campoPosVigencia = campoPosVigencia;
	}
	public String getCriarLogSN(){
		return this.criarLogSN;
	}

	public void setCriarLogSN(String criarLogSN){
        	this.criarLogSN = criarLogSN;
	}
	
}
