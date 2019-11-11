
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Entidade")
@Data
public class EntidadeEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEntidade_gen")
	@SequenceGenerator(name= "idEntidade_gen", sequenceName="idEntidade_seq", allocationSize =1)
	@Column(name = "idEntidade", updatable = false, nullable = false)
	private Long idEntidade;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "QuantidadeDeRegistros")
	private Integer quantidadeDeRegistros;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="tidade", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> entidadeEstruturaDeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="entidade", cascade=CascadeType.ALL)
	private List<RegistroEntity> entidadeRegistro;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="entidade", cascade=CascadeType.ALL)
	private List<CampoDeEntidadeEntity> entidadeCampoDeEntidade;

	@Override
	public Long getId(){
		return getIdEntidade();
	};

}