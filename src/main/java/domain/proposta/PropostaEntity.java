
package domain.proposta;

import domain.UsuarioEntity;
import domain.cliente.ConvenioClienteEntity;
import domain.cliente.ConvenioEntity;
import domain.proposta.contrato.ContratoEntity;
import domain.proposta.regra.ModeloRegraPropostaEntity;

import java.time.LocalDate;
import java.math.BigDecimal;
import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Proposta")
public class PropostaEntity extends architecture.AbstractEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idProposta_gen")
	@SequenceGenerator(name= "idProposta_gen", sequenceName="idProposta_seq", allocationSize =1)
	@Column(name = "idProposta", updatable = false, nullable = false)
	private Long idProposta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idModelodeRegra")
	private ModeloRegraPropostaEntity modelodeRegra;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "idSituacao")
	private SituacaoPropostaCreditoEnum situacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConvenioCliente")
	private ConvenioClienteEntity convenioCliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContrato")
	private ContratoEntity contrato;

	@Column(name = "Valor")
	private BigDecimal valor;
	
	@Column(name = "Data")
	private LocalDate data;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private UsuarioEntity usuario;

	@Column(name = "ProtocoloAceiteConvenio")
	private String protocoloAceiteConvenio;

	@Column(name = "Observacao")
	private String observacao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="proposta", cascade=CascadeType.ALL)
	private Set<EvolucaoPropostaEntity> evolucoes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="proposta", cascade=CascadeType.ALL)
	private Set<PropostaArquivoEntity> arquivos;

	public Long getIdProposta(){
		return this.idProposta;
	};

	public void setIdProposta(Long idProposta){
		this.idProposta = idProposta;
};

	@Override
	public Long getId(){
		return getIdProposta();
	};
	
	public ModeloRegraPropostaEntity getModelodeRegra(){
		return this.modelodeRegra;
	};

	public void setModelodeRegra(ModeloRegraPropostaEntity modelodeRegra){
        	this.modelodeRegra = modelodeRegra;
	};
	
	public SituacaoPropostaCreditoEnum getSituacao(){
		return this.situacao;
	};

	public void setSituacao(SituacaoPropostaCreditoEnum situacao){
        	TrocarSituacaoDaProposta(situacao);
	};
	
	public ContratoEntity getContrato(){
		return this.contrato;
	};

	public void setContrato(ContratoEntity contrato){
        	this.contrato = contrato;
	};
	
	public BigDecimal getValor(){
		return this.valor;
	};

	public void setValor(BigDecimal valor){
        	this.valor = valor;
	};
	
	public LocalDate getData(){
		return this.data;
	};

	public void setData(LocalDate data){
        	this.data = data;
	};
	
	public UsuarioEntity getUsuario(){
		return this.usuario;
	};

	public void setUsuario(UsuarioEntity usuario){
        	this.usuario = usuario;
	};

	public String getProtocoloAceiteConvenio(){
		return this.protocoloAceiteConvenio;
	};

	public void setProtocoloAceiteConvenio(String protocoloAceiteConvenio){
        	this.protocoloAceiteConvenio = protocoloAceiteConvenio;
	};

	public String getObservacao(){
		return this.observacao;
	};

	public void setObservacao(String observacao){
        	this.observacao = observacao;
	};
	
  	public Set<EvolucaoPropostaEntity> getEvolucoes(){
		return this.evolucoes;
	};

  	public void setEvolucoes(Set<EvolucaoPropostaEntity> evolucoes){
		this.evolucoes = evolucoes;
	}

  	public Set<PropostaArquivoEntity> getArquivos(){
		return this.arquivos;
	};

  	public void setArquivos(Set<PropostaArquivoEntity> arquivos){
		this.arquivos = arquivos;
	}

	public ConvenioClienteEntity getConvenioCliente() {
		return convenioCliente;
	}

	public void setConvenioCliente(ConvenioClienteEntity convenioCliente) {
		this.convenioCliente = convenioCliente;
	}
	
    private void TrocarSituacaoDaProposta(SituacaoPropostaCreditoEnum novaSituacao){
    	SituacaoPropostaCreditoEnum situacao = this.getSituacao();
		if (situacao == null) {
			situacao = SituacaoPropostaCreditoEnum.EM_EDICAO;
		}

		switch (situacao) {
		case EM_EDICAO:
			if (novaSituacao.equals(SituacaoPropostaCreditoEnum.ABERTA)) {
				setSituacao(novaSituacao);
			}
		case ABERTA:
			if ((novaSituacao.equals(SituacaoPropostaCreditoEnum.EM_EDICAO))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.PENDENTE_DE_ANALISE))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.CANCELADA))) {
				setSituacao(novaSituacao);
			}
			break;
		case PENDENTE_DE_ANALISE:
			if ((novaSituacao.equals(SituacaoPropostaCreditoEnum.ABERTA))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.SUBMETIDA_PARA_ANALISE))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.CANCELADA))) {
				setSituacao(novaSituacao);
			}

			break;
		case SUBMETIDA_PARA_ANALISE:
			if ((novaSituacao.equals(SituacaoPropostaCreditoEnum.ABERTA))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.APROVADA))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.REPROVADA))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.CANCELADA))) {
				setSituacao(novaSituacao);;
			}

			break;
		case APROVADA:
			if ((novaSituacao.equals(SituacaoPropostaCreditoEnum.ANALISE_NO_CONVENIO))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.CANCELADA))) {
				setSituacao(novaSituacao);
			}
			break;
		case ANALISE_NO_CONVENIO:
			if ((novaSituacao.equals(SituacaoPropostaCreditoEnum.REPROVADA_NO_CONVENIO))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.PROCESSANDO_PAGAMENTO))
					|| (novaSituacao.equals(SituacaoPropostaCreditoEnum.CANCELADA))) {
				setSituacao(novaSituacao);
			}
			break;
		case PROCESSANDO_PAGAMENTO:
			if (novaSituacao.equals(SituacaoPropostaCreditoEnum.PAGAMENTO_EFETUADO)) {
				setSituacao(novaSituacao);
			}
			break;
		case REPROVADA:
			break;
		case CANCELADA:
			break;
		case REPROVADA_NO_CONVENIO:
			break;
		default:
			break;
		}
	}
}