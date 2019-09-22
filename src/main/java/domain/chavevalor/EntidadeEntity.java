
package domain.chavevalor;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Entidade")
public class EntidadeEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEntidade_gen")
	@SequenceGenerator(name= "idEntidade_gen", sequenceName="idEntidade_seq", allocationSize =1)
	@Column(name = "idEntidade", updatable = false, nullable = false)
	private Long idEntidade;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "QuantidadeDeRegistros")
	@Enumerated()
	private Integer quantidadeDeRegistros;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="tidade", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> tidadeEstruturaDeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="entidade", cascade=CascadeType.ALL)
	private List<RegistroEntity> entidadeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="entidade", cascade=CascadeType.ALL)
	private List<CampoDeEntidadeEntity> entidadeCampoDeEntidade;
	
    	
	

	// gets e sets
	public Long getIdEntidade(){
		return this.idEntidade;
	};

    	public void setIdEntidade(Long idEntidade){
        	this.idEntidade = idEntidade;
	};
	
	@Override
	public Long getId(){
		return getIdEntidade();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public Integer getQuantidadeDeRegistros(){
		return this.quantidadeDeRegistros;
	};

	public void setQuantidadeDeRegistros(Integer quantidadeDeRegistros){
        	this.quantidadeDeRegistros = quantidadeDeRegistros;
	};
	
	
	
	//novos
	
  	public List<EstruturaDeRegistroEntity> getTidadeEstruturaDeRegistro(){
		return this.tidadeEstruturaDeRegistro;
	};
	public void setTidadeEstruturaDeRegistro(List<EstruturaDeRegistroEntity> tidadeEstruturaDeRegistro ){
		this.tidadeEstruturaDeRegistro=tidadeEstruturaDeRegistro;
	}
	
    	
	
  	public List<RegistroEntity> getEntidadeRegistro(){
		return this.entidadeRegistro;
	};
	public void setEntidadeRegistro(List<RegistroEntity> entidadeRegistro ){
		this.entidadeRegistro=entidadeRegistro;
	}
	
    	
	
  	public List<CampoDeEntidadeEntity> getEntidadeCampoDeEntidade(){
		return this.entidadeCampoDeEntidade;
	};
	public void setEntidadeCampoDeEntidade(List<CampoDeEntidadeEntity> entidadeCampoDeEntidade ){
		this.entidadeCampoDeEntidade=entidadeCampoDeEntidade;
	}
	
    	
	
	
	
	
	
}