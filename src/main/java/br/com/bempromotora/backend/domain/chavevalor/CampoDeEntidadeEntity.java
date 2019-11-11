
package br.com.bempromotora.backend.domain.chavevalor;


import javax.persistence.*;

import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "CampoDeEntidade")
@Data
public class CampoDeEntidadeEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idCampo_gen")
	@SequenceGenerator(name= "idCampo_gen", sequenceName="idCampo_seq", allocationSize =1)
	@Column(name = "idCampo", updatable = false, nullable = false)
	private Long idCampo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEntidade")
	private EntidadeEntity entidade;
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "TamanhoMaximoInteiro")
	private Integer tamanhoMaximoInteiro;
	
	@Column(name = "TamanoMinimoInteiro")
	private Integer tamanoMinimoInteiro;
	
	@Column(name = "TamanhoCasasDecimais")
	private Integer tamanhoCasasDecimais;
	
	@Column(name = "AceitaNuloSN")
	private String aceitaNuloSN;
	
	@Column(name = "AutoIncrementoSN")
	private String autoIncrementoSN;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampoChaveExtrangeira")
	private CampoDeEntidadeEntity campoChaveExtrangeira;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConteudoDefault")
	private ConteudoEntity conteudoDefault;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<PermissaoEntity> campoPermissao;
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<AliasEntity> campoAlias;
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="campo", cascade=CascadeType.ALL)
	private List<OpcaoCampoEntity> campoOpcaoDeCampo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="campoPosVigencia", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> campoPosVigenciaEstruturaDeRegistro;
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="mpo", cascade=CascadeType.ALL)
	private List<EstruturaDeRegistroEntity> mpoEstruturaDeRegistro;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="campoComparacao", cascade=CascadeType.ALL)
	private List<RegraEntity> campoComparacaoRegra;

	@Override
	public Long getId(){
		return getIdCampo();
	};
	
}