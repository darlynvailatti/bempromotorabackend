
package domain;


import javax.persistence.*;
import domain.ValoresDeOpcaoEntity;
import domain.OpcaoDeCampoEntity;
 

@Entity
@Table(name = "Alias")
public class AliasEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idAlias_gen")
	@SequenceGenerator(name= "idAlias_gen", sequenceName="idAlias_seq", allocationSize =1)
	@Column(name = "idAlias", updatable = false, nullable = false)
	private Long idAlias;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConteudo")
	private ValoresDeOpcaoEntity conteudo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idOpcao")
	private OpcaoDeCampoEntity opcao;
	@Column(name = "NomeResumido")
	private String nomeResumido;
	
	

	// gets e sets
	public Long getIdAlias(){
		return this.idAlias;
	};

    	public void setIdAlias(Long idAlias){
        	this.idAlias = idAlias;
	};
	
	@Override
	public Long getId(){
		return getIdAlias();
	};
	
	public ValoresDeOpcaoEntity getConteudo(){
		return this.conteudo;
	};

    	public void setConteudo(ValoresDeOpcaoEntity conteudo){
        	this.conteudo = conteudo;
	};
	
	public OpcaoDeCampoEntity getOpcao(){
		return this.opcao;
	};

    	public void setOpcao(OpcaoDeCampoEntity opcao){
        	this.opcao = opcao;
	};
	
	public String getNomeResumido(){
		return this.nomeResumido;
	};

	public void setNomeResumido(String nomeResumido){
        	this.nomeResumido = nomeResumido;
	};
	
	
	
	//novos
	
	
	
	
	
}