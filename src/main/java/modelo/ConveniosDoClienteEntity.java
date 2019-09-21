
package modelo;

import java.time.LocalDate;

import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ClienteEntity;
import modelo.ConvenioEntity;

import java.util.List;
 

@Entity
@Table(name = "ConveniosDoCliente")
public class ConveniosDoClienteEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idCliente", referencedColumnName="idCliente")
	
	private ClienteEntity cliente;
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConvenio", referencedColumnName="idConvenio")
	
	private ConvenioEntity convenio;
	@Column(name = "Matricula")
	private String matricula;
	
	@Column(name = "DataEntrada")
	private LocalDate dataEntrada;
	
	@Column(name = "DataFim")
	private LocalDate dataFim;
	
	

	// gets e sets
	public ClienteEntity getCliente(){
		return this.cliente;
	};

    	public void setCliente(ClienteEntity cliente){
        	this.cliente = cliente;
	};
	@Override
	public Long getId(){
		return getCliente().getId();
	};
	
	public ConvenioEntity getConvenio(){
		return this.convenio;
	};

    	public void setConvenio(ConvenioEntity convenio){
        	this.convenio = convenio;
	};
	@Override
	public Long getId(){
		return getConvenio().getId();
	};
	
	public String getMatricula(){
		return this.matricula;
	};

	public void setMatricula(String matricula){
        	this.matricula = matricula;
	};
	
	public LocalDate getDataEntrada(){
		return this.dataEntrada;
	};

	public void setDataEntrada(LocalDate dataEntrada){
        	this.dataEntrada = dataEntrada;
	};
	
	public LocalDate getDataFim(){
		return this.dataFim;
	};

	public void setDataFim(LocalDate dataFim){
        	this.dataFim = dataFim;
	};
	
	
	
	//novos
	
	
	
	
	
}