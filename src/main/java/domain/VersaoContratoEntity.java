
package domain;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "VersaoContrato")
public class VersaoContratoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idVersaoModelo_gen")
	@SequenceGenerator(name= "idVersaoModelo_gen", sequenceName="idVersaoModelo_seq", allocationSize =1)
	@Column(name = "idVersaoModelo", updatable = false, nullable = false)
	private Long idVersaoModelo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ModelodeContrato")
	private ModeloContratoEntity delodeContrato;

	@Column(name = "TextoInicial")
	private byte[] textoInicial;
	
	@Column(name = "TextoFinal")
	private byte[] textoFinal;
	
	@Column(name = "DataIniVigencia")
	private LocalDate dataIniVigencia;
	
	@Column(name = "DataFimVigencial")
	private LocalDate dataFimVigencial;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="versaoModelo", cascade=CascadeType.ALL)
	private TextosDoContratoEntity versaoModeloTextosDoContrato;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="versao", cascade=CascadeType.ALL)
	private List<ContratoEntity> versaoContrato;
	
    	
	

	// gets e sets
	public Long getIdVersaoModelo(){
		return this.idVersaoModelo;
	};

    	public void setIdVersaoModelo(Long idVersaoModelo){
        	this.idVersaoModelo = idVersaoModelo;
	};
	
	@Override
	public Long getId(){
		return getIdVersaoModelo();
	};
	
	public ModeloContratoEntity getDelodeContrato(){
		return this.delodeContrato;
	};

    	public void setDelodeContrato(ModeloContratoEntity delodeContrato){
        	this.delodeContrato = delodeContrato;
	};
	
	public byte[] getTextoInicial(){
		return this.textoInicial;
	};

	public void setTextoInicial(byte[] textoInicial){
        	this.textoInicial = textoInicial;
	};
	
	public byte[] getTextoFinal(){
		return this.textoFinal;
	};

	public void setTextoFinal(byte[] textoFinal){
        	this.textoFinal = textoFinal;
	};
	
	public LocalDate getDataIniVigencia(){
		return this.dataIniVigencia;
	};

	public void setDataIniVigencia(LocalDate dataIniVigencia){
        	this.dataIniVigencia = dataIniVigencia;
	};
	
	public LocalDate getDataFimVigencial(){
		return this.dataFimVigencial;
	};

	public void setDataFimVigencial(LocalDate dataFimVigencial){
        	this.dataFimVigencial = dataFimVigencial;
	};
	
	
	
	//novos
	
  	public TextosDoContratoEntity getVersaoModeloTextosDoContrato(){
		return this.versaoModeloTextosDoContrato;
	};
	public void setVersaoModeloTextosDoContrato(TextosDoContratoEntity versaoModeloTextosDoContrato ){
		this.versaoModeloTextosDoContrato=versaoModeloTextosDoContrato;
	};

	
    	
	
  	public List<ContratoEntity> getVersaoContrato(){
		return this.versaoContrato;
	};
	public void setVersaoContrato(List<ContratoEntity> versaoContrato ){
		this.versaoContrato=versaoContrato;
	}
	
    	
	
	
	
	
	
}