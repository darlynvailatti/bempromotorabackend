
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "Alias")
public class AliasEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idAlias_gen")
	@SequenceGenerator(name= "idAlias_gen", sequenceName="idAlias_seq", allocationSize =1)
	@Column(name = "idAlias", updatable = false, nullable = false)
	private Long idAlias;

	@OneToOne(fetch = FetchType.LAZY)
	private CampoDeEntidadeEntity campo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConteudo")
	private ValorOpcaoEntity conteudo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idOpcao")
	private OpcaoCampoEntity opcao;

	@Column(name = "NomeResumido")
	private String nomeResumido;
	
	@Override
	public Long getId(){
		return getIdAlias();
	};

}