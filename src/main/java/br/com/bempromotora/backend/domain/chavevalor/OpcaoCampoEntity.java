
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

 

@Entity
@Table(name = "OpcaoCampo")
@Data
public class OpcaoCampoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idOpcao_gen")
	@SequenceGenerator(name= "idOpcao_gen", sequenceName="idOpcao_seq", allocationSize =1)
	@Column(name = "idOpcao", updatable = false, nullable = false)
	private Long idOpcao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampo")
	private CampoDeEntidadeEntity campo;

	@Column(name = "NomeLogico")
	private String nomeLogico;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="opcao", cascade=CascadeType.ALL)
	private List<AliasEntity> opcaoAlias;

	@ManyToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Override
	public Long getId(){
		return getIdOpcao();
	};
	
}