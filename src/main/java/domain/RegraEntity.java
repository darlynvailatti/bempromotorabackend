
package domain;


import javax.persistence.*;


@Entity
@Table(name = "Regra")
public class RegraEntity extends domain.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idRegra_gen")
	@SequenceGenerator(name= "idRegra_gen", sequenceName="idRegra_seq", allocationSize =1)
	@Column(name = "idRegra", updatable = false, nullable = false)
	private Long idRegra;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idModelodeRegra")
	private ModeloRegraPropostaEntity modelodeRegra;
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "OperadorComparacao")
	private String operadorComparacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idInformacaoComparacao")
	private InformacaoEntity informacaoComparacao;
	

	// gets e sets
	public Long getIdRegra(){
		return this.idRegra;
	};

    	public void setIdRegra(Long idRegra){
        	this.idRegra = idRegra;
	};
	
	@Override
	public Long getId(){
		return getInformacaoComparacao();
	};
	
	public ModeloRegraPropostaEntity getModelodeRegra(){
		return this.modelodeRegra;
	};

    	public void setModelodeRegra(ModeloRegraPropostaEntity modelodeRegra){
        	this.modelodeRegra = modelodeRegra;
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public String getOperadorComparacao(){
		return this.operadorComparacao;
	};

	public void setOperadorComparacao(String operadorComparacao){
        	this.operadorComparacao = operadorComparacao;
	};
	
	public InformacaoEntity getInformacaoComparacao(){
		return this.informacaoComparacao;
	};

    	public void setInformacaoComparacao(InformacaoEntity informacaoComparacao){
        	this.informacaoComparacao = informacaoComparacao;
	};
	
	
	
	//novos
	
	
	
	
	
}