
package rest.dto;

import rest.pattern.AbstractRestDTO;

import java.time.LocalDate;

public class VersoesContratoDTO extends AbstractRestDTO {

	private Long versaoModelo;
	
	private ModelosContratoDTO delodeContrato;

	 private byte[] textoInicial;
	
	 private byte[] textoFinal;

	 private LocalDate dataIniVigencia;

	 private LocalDate dataFimVigencial;
	
	
	public Long getVersaoModelo(){
		return this.versaoModelo;
	}

    	public void setVersaoModelo(Long versaoModelo){
        	this.versaoModelo = versaoModelo;
	}
	public ModelosContratoDTO getDelodeContrato(){
		return this.delodeContrato;
	}

    	public void setDelodeContrato(ModelosContratoDTO delodeContrato){
        	this.delodeContrato = delodeContrato;
	}
	public byte[] getTextoInicial(){
		return this.textoInicial;
	}

	public void setTextoInicial(byte[] textoInicial){
        	this.textoInicial = textoInicial;
	}
	public byte[] getTextoFinal(){
		return this.textoFinal;
	}

	public void setTextoFinal(byte[] textoFinal){
        	this.textoFinal = textoFinal;
	}
	public LocalDate getDataIniVigencia(){
		return this.dataIniVigencia;
	}

	public void setDataIniVigencia(LocalDate dataIniVigencia){
        	this.dataIniVigencia = dataIniVigencia;
	}
	public LocalDate getDataFimVigencial(){
		return this.dataFimVigencial;
	}

	public void setDataFimVigencial(LocalDate dataFimVigencial){
        	this.dataFimVigencial = dataFimVigencial;
	}
	
}
