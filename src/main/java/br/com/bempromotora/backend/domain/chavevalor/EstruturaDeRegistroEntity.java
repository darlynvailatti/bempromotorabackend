
package br.com.bempromotora.backend.domain.chavevalor;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "EstruturaDeRegistro")
@Data
public class EstruturaDeRegistroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idEstrutura_gen")
	@SequenceGenerator(name= "idEstrutura_gen", sequenceName="idEstrutura_seq", allocationSize =1)
	@Column(name = "idEstrutura", updatable = false, nullable = false)
	private Long idEstrutura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Entidade")
	private EntidadeEntity tidade;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Campo")
	private CampoDeEntidadeEntity mpo;

	@Column(name = "DataInicio")
	private LocalDate dataInicio;
	
	@Column(name = "DataFimVigencia")
	private LocalDate dataFimVigencia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEstruturaPai")
	private EstruturaDeRegistroEntity estruturaPai;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampoPosVigencia")
	private CampoDeEntidadeEntity campoPosVigencia;

	@Column(name = "CriarLogSN")
	private String criarLogSN;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="estrutura", cascade=CascadeType.ALL)
	private List<InformacaoEntity> estruturaInformacao;
	
	@Override
	public Long getId(){
		return getIdEstrutura();
	};
}