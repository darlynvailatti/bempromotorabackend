
package br.com.bempromotora.backend.domain.cliente;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Convenio")
@Data
public class ConvenioEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idConvenio_gen")
	@SequenceGenerator(name= "idConvenio_gen", sequenceName="idConvenio_seq", allocationSize =1)
	@Column(name = "idConvenio", updatable = false, nullable = false)
	private Long idConvenio;
	
	@Column(name = "Descricao")
	private String descricao;

	@Override
	public Long getId(){
		return getIdConvenio();
	};

}