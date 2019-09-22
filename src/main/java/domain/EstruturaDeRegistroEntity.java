
package domain;

import java.time.LocalDate;

import javax.persistence.*;

import domain.CampoDeEntidadeEntity;
import domain.EntidadeEntity;
import domain.EstruturaDeRegistroEntity;
import domain.InformacaoEntity;
import java.util.List;

 

@Entity
@Table(name = "EstruturaDeRegistro")
public class EstruturaDeRegistroEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEstrutura_gen")
	@SequenceGenerator(name= "idEstrutura_gen", sequenceName="idEstrutura_seq", allocationSize =1)
	@Column(name = "idEstrutura", updatable = false, nullable = false)
	private Long idEstrutura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Entidade")
	private EntidadeEntity tidade;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Campo")
	private CampoDeEntidadeEntity mpo;
	@Column(name = "DataInicio")
	private LocalDate dataInicio;
	
	@Column(name = "DataFimVigencia")
	private LocalDate dataFimVigencia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEstruturaPai")
	private EstruturaDeRegistroEntity estruturaPai;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampoPosVigencia")
	private CampoDeEntidadeEntity campoPosVigencia;
	@Column(name = "CriarLogSN")
	private String criarLogSN;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="estrutura", cascade=CascadeType.ALL)
	private List<InformacaoEntity> estruturaInformacao;
	
    	
	

	// gets e sets
	public Long getIdEstrutura(){
		return this.idEstrutura;
	};

    	public void setIdEstrutura(Long idEstrutura){
        	this.idEstrutura = idEstrutura;
	};
	
	@Override
	public Long getId(){
		return getIdEstrutura();
	};
	
	public EntidadeEntity getTidade(){
		return this.tidade;
	};

    	public void setTidade(EntidadeEntity tidade){
        	this.tidade = tidade;
	};
	
	public CampoDeEntidadeEntity getMpo(){
		return this.mpo;
	};

    	public void setMpo(CampoDeEntidadeEntity mpo){
        	this.mpo = mpo;
	};
	
	public LocalDate getDataInicio(){
		return this.dataInicio;
	};

	public void setDataInicio(LocalDate dataInicio){
        	this.dataInicio = dataInicio;
	};
	
	public LocalDate getDataFimVigencia(){
		return this.dataFimVigencia;
	};

	public void setDataFimVigencia(LocalDate dataFimVigencia){
        	this.dataFimVigencia = dataFimVigencia;
	};
	
	public EstruturaDeRegistroEntity getEstruturaPai(){
		return this.estruturaPai;
	};

    	public void setEstruturaPai(EstruturaDeRegistroEntity estruturaPai){
        	this.estruturaPai = estruturaPai;
	};
	
	public CampoDeEntidadeEntity getCampoPosVigencia(){
		return this.campoPosVigencia;
	};

    	public void setCampoPosVigencia(CampoDeEntidadeEntity campoPosVigencia){
        	this.campoPosVigencia = campoPosVigencia;
	};
	
	public String getCriarLogSN(){
		return this.criarLogSN;
	};

	public void setCriarLogSN(String criarLogSN){
        	this.criarLogSN = criarLogSN;
	};
	
	
	
	//novos
	
  	public List<InformacaoEntity> getEstruturaInformacao(){
		return this.estruturaInformacao;
	};
	public void setEstruturaInformacao(List<InformacaoEntity> estruturaInformacao ){
		this.estruturaInformacao=estruturaInformacao;
	}
	
    	
	
	
	
	
	
}