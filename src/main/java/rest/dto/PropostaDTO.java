
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PropostaDTO extends AbstractRestDTO {

	private Long idProposta;

	private ModeloRegrasPropostaDTO modelodeRegra;

	private SituacaoPropostaDTO situacao;
	
	private ConvenioDTO convenio;
	
	private ContratoDTO contrato;
	
	 private BigDecimal valor;

	 private LocalDate data;

	private UsuarioDTO usuario;

	private String protocolodoConvenio;

	private String observacao;
	
	public Long getIdProposta(){
		return this.idProposta;
	}

    	public void setIdProposta(Long idProposta){
        	this.idProposta = idProposta;
	}
	public ModeloRegrasPropostaDTO getModelodeRegra(){
		return this.modelodeRegra;
	}

    	public void setModelodeRegra(ModeloRegrasPropostaDTO modelodeRegra){
        	this.modelodeRegra = modelodeRegra;
	}
	public SituacaoPropostaDTO getSituacao(){
		return this.situacao;
	}

    	public void setSituacao(SituacaoPropostaDTO situacao){
        	this.situacao = situacao;
	}
	public ConvenioDTO getConvenio(){
		return this.convenio;
	}

    	public void setConvenio(ConvenioDTO convenio){
        	this.convenio = convenio;
	}
	public ContratoDTO getContrato(){
		return this.contrato;
	}

    	public void setContrato(ContratoDTO contrato){
        	this.contrato = contrato;
	}
	public BigDecimal getValor(){
		return this.valor;
	}

	public void setValor(BigDecimal valor){
        	this.valor = valor;
	}
	public LocalDate getData(){
		return this.data;
	}

	public void setData(LocalDate data){
        	this.data = data;
	}
	public UsuarioDTO getUsuario(){
		return this.usuario;
	}

    	public void setUsuario(UsuarioDTO usuario){
        	this.usuario = usuario;
	}
	public String getProtocolodoConvenio(){
		return this.protocolodoConvenio;
	}

	public void setProtocolodoConvenio(String protocolodoConvenio){
        	this.protocolodoConvenio = protocolodoConvenio;
	}
	public String getObservacao(){
		return this.observacao;
	}

	public void setObservacao(String observacao){
        	this.observacao = observacao;
	}
	
}
