
package domain.cliente;


import domain.proposta.PropostaEntity;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Convenio")
public class ConvenioEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idConvenio_gen")
	@SequenceGenerator(name= "idConvenio_gen", sequenceName="idConvenio_seq", allocationSize =1)
	@Column(name = "idConvenio", updatable = false, nullable = false)
	private Long idConvenio;
	
	@Column(name = "Descricao")
	private String descricao;
	
	public Long getIdConvenio(){
		return this.idConvenio;
	};

	public void setIdConvenio(Long idConvenio){
        	this.idConvenio = idConvenio;
	};
	
	@Override
	public Long getId(){
		return getIdConvenio();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};

}