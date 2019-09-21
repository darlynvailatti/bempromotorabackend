
package domain;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Cidade")
public class CidadeEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idCidade_gen")
	@SequenceGenerator(name= "idCidade_gen", sequenceName="idCidade_seq", allocationSize =1)
	@Column(name = "idCidade", updatable = false, nullable = false)
	private Long idCidade;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "UF")
	private String uF;
	
	@Column(name = "Pais")
	private String pais;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cidade", cascade=CascadeType.ALL)
	private List<LogradouroEntity> cidadeLogradouro;
	
    	
	

	// gets e sets
	public Long getIdCidade(){
		return this.idCidade;
	};

    	public void setIdCidade(Long idCidade){
        	this.idCidade = idCidade;
	};
	
	@Override
	public Long getId(){
		return getIdCidade();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public String getUF(){
		return this.uF;
	};

	public void setUF(String uF){
        	this.uF = uF;
	};
	
	public String getPais(){
		return this.pais;
	};

	public void setPais(String pais){
        	this.pais = pais;
	};
	
	
	
	//novos
	
  	public List<LogradouroEntity> getCidadeLogradouro(){
		return this.cidadeLogradouro;
	};
	public void setCidadeLogradouro(List<LogradouroEntity> cidadeLogradouro ){
		this.cidadeLogradouro=cidadeLogradouro;
	}
	
    	
	
	
	
	
	
}