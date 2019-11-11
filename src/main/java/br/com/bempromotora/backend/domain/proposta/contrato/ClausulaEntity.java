
package br.com.bempromotora.backend.domain.proposta.contrato;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "Clausula")
@Data
public class ClausulaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idClausula_gen")
	@SequenceGenerator(name= "idClausula_gen", sequenceName="idClausula_seq", allocationSize =1)
	@Column(name = "idClausula", updatable = false, nullable = false)
	private Long idClausula;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataFinalDeVigencia")
	private LocalDate dataFinalDeVigencia;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="clausula", cascade=CascadeType.ALL)
	private TextoContratoEntity clausulaTextosDoContrato;

	@Override
	public Long getId(){
		return getIdClausula();
	};

}