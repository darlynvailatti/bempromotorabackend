
package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.domain.common.NotificacaoEntity;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "EvolucaoProposta")
@Data
public class EvolucaoPropostaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEvolucaoProposta_gen")
	@SequenceGenerator(name= "idEvolucaoProposta_gen", sequenceName="idEvolucaoProposta_seq", allocationSize =1)
	@Column(name = "idEvolucaoProposta", updatable = false, nullable = false)
	private Long idEvolucaoProposta;

	@ManyToOne(fetch = FetchType.LAZY)
	private PropostaEntity proposta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private UsuarioEntity usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idNotificacao")
	private NotificacaoEntity notificacao;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idSituacao")
	private SituacaoPropostaCreditoEnum situacao;

	@Column(name = "DataHora")
	private LocalDate dataHora;
	
	@Override
	public Long getId(){
		return getIdEvolucaoProposta();
	};

}