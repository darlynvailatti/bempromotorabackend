
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.InformacaoBancariaEntity;
import modelo.LogradouroEntity;
import modelo.ParceiroEntity;

import java.util.List;

 

@Entity
@Table(name = "Localidade")
public class LocalidadeEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idLocalidade_gen")
	@SequenceGenerator(name= "idLocalidade_gen", sequenceName="idLocalidade_seq", allocationSize =1)
	@Column(name = "idLocalidade", updatable = false, nullable = false)
	private Long idLocalidade;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiro")
	private ParceiroEntity parceiro;
	@Column(name = "ResidencialouComercial")
	private String residencialouComercial;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idInformacaoBancaria")
	private InformacaoBancariaEntity informacaoBancaria;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="localidade", cascade=CascadeType.ALL)
	private List<LogradouroEntity> localidadeLogradouro;
	
    	
	

	// gets e sets
	public Long getIdLocalidade(){
		return this.idLocalidade;
	};

    	public void setIdLocalidade(Long idLocalidade){
        	this.idLocalidade = idLocalidade;
	};
	
	@Override
	public Long getId(){
		return getIdLocalidade();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public ParceiroEntity getParceiro(){
		return this.parceiro;
	};

    	public void setParceiro(ParceiroEntity parceiro){
        	this.parceiro = parceiro;
	};
	
	public String getResidencialouComercial(){
		return this.residencialouComercial;
	};

	public void setResidencialouComercial(String residencialouComercial){
        	this.residencialouComercial = residencialouComercial;
	};
	
	public InformacaoBancariaEntity getInformacaoBancaria(){
		return this.informacaoBancaria;
	};

    	public void setInformacaoBancaria(InformacaoBancariaEntity informacaoBancaria){
        	this.informacaoBancaria = informacaoBancaria;
	};
	
	
	
	//novos
	
  	public List<LogradouroEntity> getLocalidadeLogradouro(){
		return this.localidadeLogradouro;
	};
	public void setLocalidadeLogradouro(List<LogradouroEntity> localidadeLogradouro ){
		this.localidadeLogradouro=localidadeLogradouro;
	}
	
    	
	
	
	
	
	
}