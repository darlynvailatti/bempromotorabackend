
package br.com.bempromotora.backend.domain.parceiro;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Localidade")
@Data
public class LocalidadeEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
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

	@Override
	public Long getId(){
		return getIdLocalidade();
	};

}