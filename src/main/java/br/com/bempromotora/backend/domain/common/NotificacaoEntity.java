
package br.com.bempromotora.backend.domain.common;


import br.com.bempromotora.backend.domain.parceiro.ParceiroEntity;
import br.com.bempromotora.backend.domain.proposta.EvolucaoPropostaEntity;
import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Notificacao")
@Data
public class NotificacaoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idNotificacao_gen")
	@SequenceGenerator(name = "idNotificacao_gen", sequenceName = "idNotificacao_seq", allocationSize = 1)
	@Column(name = "idNotificacao", updatable = false, nullable = false)
	private Long idNotificacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idParceiroNotificador")
	private ParceiroEntity parceiroNotificador;

	@Column(name = "TextoNotificacao")
	private String textoNotificacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idParceiroNotificado")
	private ParceiroEntity parceiroNotificado;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notificacao", cascade = CascadeType.ALL)
	private List<EvolucaoPropostaEntity> notificacaoEvolucoesDaProposta;

	@Override
	public Long getId() {
		return getIdNotificacao();
	}

	;

}