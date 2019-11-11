
package br.com.bempromotora.backend.domain.proposta.regra;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "ModeloRegraProposta")
@Data
public class ModeloRegraPropostaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idModeloDeRegra_gen")
	@SequenceGenerator(name= "idModeloDeRegra_gen", sequenceName="idModeloDeRegra_seq", allocationSize =1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "DataInicioVigencia")
	private LocalDate dataInicioVigencia;
	
	@Column(name = "DataFimVigencia")
	private LocalDate dataFimVigencia;

	@Override
	public Long getId(){
		return this.id;
	}

}