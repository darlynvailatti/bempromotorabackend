
package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import br.com.bempromotora.backend.domain.cliente.ConvenioClienteEntity;
import br.com.bempromotora.backend.domain.proposta.contrato.ContratoEntity;
import br.com.bempromotora.backend.domain.proposta.regra.ModeloRegraPropostaEntity;
import lombok.Data;

import java.time.LocalDate;
import java.math.BigDecimal;
import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Proposta")
@Data
public class PropostaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProposta_gen")
	@SequenceGenerator(name = "idProposta_gen", sequenceName = "idProposta_seq", allocationSize = 1)
	@Column(name = "idProposta", updatable = false, nullable = false)
	private Long idProposta;

	@ManyToOne(fetch = FetchType.LAZY)
	private ClienteEntity cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idModelodeRegra")
	private ModeloRegraPropostaEntity modelodeRegra;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idSituacao")
	private SituacaoPropostaCreditoEnum situacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idConvenioCliente")
	private ConvenioClienteEntity convenioCliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idContrato")
	private ContratoEntity contrato;

	@Column(name = "Valor")
	private BigDecimal valor;

	@Column(name = "Data")
	private LocalDate data;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	private UsuarioEntity usuario;

	@Column(name = "ProtocoloAceiteConvenio")
	private String protocoloAceiteConvenio;

	@Column(name = "Observacao")
	private String observacao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proposta", cascade = CascadeType.ALL)
	private Set<EvolucaoPropostaEntity> evolucoes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proposta", cascade = CascadeType.ALL)
	private Set<PropostaArquivoEntity> arquivos;

	@Override
	public Long getId() {
		return getIdProposta();
	}

	;
}