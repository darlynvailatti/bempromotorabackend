
package domain;


import javax.persistence.*;

import domain.AliasEntity;
import domain.CampoDeEntidadeEntity;
import domain.ConteudoEntity;
import domain.EntidadeEntity;
import domain.EstruturaDeRegistroEntity;
import domain.PermissaoEntity;
import domain.proposta.regra.RegraEntity;

import java.util.List;

import domain.OpcaoDeCampoEntity;

 

@Entity
@Table(name = "CampoDeEntidade")
public class CampoDeEntidadeEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idCampo_gen")
	@SequenceGenerator(name= "idCampo_gen", sequenceName="idCampo_seq", allocationSize =1)
	@Column(name = "idCampo", updatable = false, nullable = false)
	private Long idCampo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEntidade")
	private EntidadeEntity entidade;
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "TamanhoMaximoInteiro")
	private Integer tamanhoMaximoInteiro;
	
	@Column(name = "TamanoMinimoInteiro")
	private Integer tamanoMinimoInteiro;
	
	@Column(name = "TamanhoCasasDecimais")
	private Integer tamanhoCasasDecimais;
	
	@Column(name = "AceitaNuloSN")
	private String aceitaNuloSN;
	
	@Column(name = "AutoIncrementoSN")
	private String autoIncrementoSN;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampoChaveExtrangeira")
	private CampoDeEntidadeEntity campoChaveExtrangeira;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConteudoDefault")
	private ConteudoEntity conteudoDefault;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<PermissaoEntity> campoPermissao;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<AliasEntity> campoAlias;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<OpcaoDeCampoEntity> campoOpcaoDeCampo;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campoPosVigencia", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> campoPosVigenciaEstruturaDeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="mpo", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> mpoEstruturaDeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campoComparacao", cascade=CascadeType.ALL)
	private List<RegraEntity> campoComparacaoRegra;
	
    	
	

	// gets e sets
	public Long getIdCampo(){
		return this.idCampo;
	};

    	public void setIdCampo(Long idCampo){
        	this.idCampo = idCampo;
	};
	
	@Override
	public Long getId(){
		return getIdCampo();
	};
	
	public EntidadeEntity getEntidade(){
		return this.entidade;
	};

    	public void setEntidade(EntidadeEntity entidade){
        	this.entidade = entidade;
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public Integer getTamanhoMaximoInteiro(){
		return this.tamanhoMaximoInteiro;
	};

	public void setTamanhoMaximoInteiro(Integer tamanhoMaximoInteiro){
        	this.tamanhoMaximoInteiro = tamanhoMaximoInteiro;
	};
	
	public Integer getTamanoMinimoInteiro(){
		return this.tamanoMinimoInteiro;
	};

	public void setTamanoMinimoInteiro(Integer tamanoMinimoInteiro){
        	this.tamanoMinimoInteiro = tamanoMinimoInteiro;
	};
	
	public Integer getTamanhoCasasDecimais(){
		return this.tamanhoCasasDecimais;
	};

	public void setTamanhoCasasDecimais(Integer tamanhoCasasDecimais){
        	this.tamanhoCasasDecimais = tamanhoCasasDecimais;
	};
	
	public String getAceitaNuloSN(){
		return this.aceitaNuloSN;
	};

	public void setAceitaNuloSN(String aceitaNuloSN){
        	this.aceitaNuloSN = aceitaNuloSN;
	};
	
	public String getAutoIncrementoSN(){
		return this.autoIncrementoSN;
	};

	public void setAutoIncrementoSN(String autoIncrementoSN){
        	this.autoIncrementoSN = autoIncrementoSN;
	};
	
	public CampoDeEntidadeEntity getCampoChaveExtrangeira(){
		return this.campoChaveExtrangeira;
	};

    	public void setCampoChaveExtrangeira(CampoDeEntidadeEntity campoChaveExtrangeira){
        	this.campoChaveExtrangeira = campoChaveExtrangeira;
	};
	
	public ConteudoEntity getConteudoDefault(){
		return this.conteudoDefault;
	};

    	public void setConteudoDefault(ConteudoEntity conteudoDefault){
        	this.conteudoDefault = conteudoDefault;
	};
	
	
	
	//novos
	
  	public List<PermissaoEntity> getCampoPermissao(){
		return this.campoPermissao;
	};
	public void setCampoPermissao(List<PermissaoEntity> campoPermissao ){
		this.campoPermissao=campoPermissao;
	}
	
    	
	
  	public List<AliasEntity> getCampoAlias(){
		return this.campoAlias;
	};
	public void setCampoAlias(List<AliasEntity> campoAlias ){
		this.campoAlias=campoAlias;
	}
	
    	
	
  	public List<OpcaoDeCampoEntity> getCampoOpcaoDeCampo(){
		return this.campoOpcaoDeCampo;
	};
	public void setCampoOpcaoDeCampo(List<OpcaoDeCampoEntity> campoOpcaoDeCampo ){
		this.campoOpcaoDeCampo=campoOpcaoDeCampo;
	}
	
    	
	
  	public List<EstruturaDeRegistroEntity> getCampoPosVigenciaEstruturaDeRegistro(){
		return this.campoPosVigenciaEstruturaDeRegistro;
	};
	public void setCampoPosVigenciaEstruturaDeRegistro(List<EstruturaDeRegistroEntity> campoPosVigenciaEstruturaDeRegistro ){
		this.campoPosVigenciaEstruturaDeRegistro=campoPosVigenciaEstruturaDeRegistro;
	}
	
    	
	public List<EstruturaDeRegistroEntity> getMpoEstruturaDeRegistro(){
		return this.mpoEstruturaDeRegistro;
	};
	public void setMpoEstruturaDeRegistro(List<EstruturaDeRegistroEntity> mpoEstruturaDeRegistro ){
		this.mpoEstruturaDeRegistro=mpoEstruturaDeRegistro;
	}
	
    	
	
  	public List<RegraEntity> getCampoComparacaoRegra(){
		return this.campoComparacaoRegra;
	};
	public void setCampoComparacaoRegra(List<RegraEntity> campoComparacaoRegra ){
		this.campoComparacaoRegra=campoComparacaoRegra;
	}
	
    	
	
	
	
	
	
}