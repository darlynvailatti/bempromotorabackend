
package br.com.bempromotora.backend.domain.proposta;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

  

@Entity
@Table(name = "SituacaoProposta")
@Data
public class SituacaoPropostaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSituacao_gen")
	@SequenceGenerator(name = "idSituacao_gen", sequenceName = "idSituacao_seq", allocationSize = 1)
	@Column(name = "idSituacao", updatable = false, nullable = false)
	private Long idSituacao;

	@Column(name = "Descricao")
	private String descricao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "situacao", cascade = CascadeType.ALL)
	private List<EvolucaoPropostaEntity> situacaoEvolucoesDaProposta;


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "situacao", cascade = CascadeType.ALL)
	private List<PropostaEntity> situacaoProposta;

	@Override
	public Long getId() {
		return getIdSituacao();
	}

}

