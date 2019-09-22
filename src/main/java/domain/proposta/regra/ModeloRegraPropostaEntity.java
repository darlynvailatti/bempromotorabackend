
package domain.proposta.regra;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "ModeloRegraProposta")
public class ModeloRegraPropostaEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idModeloDeRegra_gen")
	@SequenceGenerator(name= "idModeloDeRegra_gen", sequenceName="idModeloDeRegra_seq", allocationSize =1)
	@Column(name = "idModeloDeRegra", updatable = false, nullable = false)
	private Long idModeloDeRegra;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInicioVigencia")
	private LocalDate dataInicioVigencia;
	
	@Column(name = "DataFimVigencia")
	private LocalDate dataFimVigencia;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="modelodeRegra", cascade=CascadeType.ALL)
	private Set<RegraEntity> regras;

	public Long getIdModeloDeRegra(){
		return this.idModeloDeRegra;
	};

	public void setIdModeloDeRegra(Long idModeloDeRegra){
        	this.idModeloDeRegra = idModeloDeRegra;
	};
	
	@Override
	public Long getId(){
		return getIdModeloDeRegra();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	public LocalDate getDataInicioVigencia(){
		return this.dataInicioVigencia;
	};

	public void setDataInicioVigencia(LocalDate dataInicioVigencia){
        	this.dataInicioVigencia = dataInicioVigencia;
	};
	
	public LocalDate getDataFimVigencia(){
		return this.dataFimVigencia;
	};

	public void setDataFimVigencia(LocalDate dataFimVigencia){
        	this.dataFimVigencia = dataFimVigencia;
	};

  	public Set<RegraEntity> getRegras(){
		return this.regras;
	};

	public void setRegras(Set<RegraEntity> regras){
		this.regras = regras;
	}
	
    	
	
	
	
	
	
}