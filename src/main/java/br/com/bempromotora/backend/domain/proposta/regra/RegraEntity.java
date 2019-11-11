
package br.com.bempromotora.backend.domain.proposta.regra;


import br.com.bempromotora.backend.domain.chavevalor.CampoDeEntidadeEntity;
import br.com.bempromotora.backend.domain.chavevalor.InformacaoEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Regra")
@Data
public class RegraEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idRegra_gen")
	@SequenceGenerator(name = "idRegra_gen", sequenceName = "idRegra_seq", allocationSize = 1)
	@Column(name = "idRegra", updatable = false, nullable = false)
	private Long idRegra;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModeloRegra")
	private ModeloRegraPropostaEntity modeloRegra;

	@Column(name = "Descricao")
	private String descricao;

	@Enumerated(EnumType.ORDINAL)
	private OperadorRegraEnum operadorComparacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idInformacaoComparacao")
	private InformacaoEntity informacaoComparacao;

	@ManyToOne(fetch = FetchType.LAZY)
	private CampoDeEntidadeEntity campoComparacao;

	@Override
	public Long getId() {
		return this.idRegra;
	}

}