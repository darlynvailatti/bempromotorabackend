
package domain;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Contrato")
public class ContratoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idContrato_gen")
	@SequenceGenerator(name= "idContrato_gen", sequenceName="idContrato_seq", allocationSize =1)
	@Column(name = "idContrato", updatable = false, nullable = false)
	private Long idContrato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idVersao")
	private VersaoContratoEntity versao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<PropostaEntity> contratoProposta;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<ContratoArquivoEntity> contratoContratoArquivo;
	
    	
	

	// gets e sets
	public Long getIdContrato(){
		return this.idContrato;
	};

    	public void setIdContrato(Long idContrato){
        	this.idContrato = idContrato;
	};
	
	@Override
	public Long getId(){
		return getIdContrato();
	};
	
	public VersaoContratoEntity getVersao(){
		return this.versao;
	};

    	public void setVersao(VersaoContratoEntity versao){
        	this.versao = versao;
	};
	
	
	
	//novos
	
  	public List<PropostaEntity> getContratoProposta(){
		return this.contratoProposta;
	};
	public void setContratoProposta(List<PropostaEntity> contratoProposta ){
		this.contratoProposta=contratoProposta;
	}
	
    	
	
  	public List<ContratoArquivoEntity> getContratoContratoArquivo(){
		return this.contratoContratoArquivo;
	};
	public void setContratoContratoArquivo(List<ContratoArquivoEntity> contratoContratoArquivo ){
		this.contratoContratoArquivo=contratoContratoArquivo;
	}
	
    	
	
	
	
	
	
}