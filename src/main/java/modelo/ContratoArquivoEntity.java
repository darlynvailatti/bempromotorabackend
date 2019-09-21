
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ArquivoEntity;
import modelo.ContratoEntity;

import java.util.List;
 

@Entity
@Table(name = "ContratoArquivo")
public class ContratoArquivoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContrato")
	private ContratoEntity contrato;
	

	// gets e sets
	public ArquivoEntity getArquivo(){
		return this.arquivo;
	};

    	public void setArquivo(ArquivoEntity arquivo){
        	this.arquivo = arquivo;
	};
	@Override
	public Long getId(){
		return getArquivo().getId();
	};
	
	public ContratoEntity getContrato(){
		return this.contrato;
	};

    	public void setContrato(ContratoEntity contrato){
        	this.contrato = contrato;
	};
	
	
	
	//novos
	
	
	
	
	
}