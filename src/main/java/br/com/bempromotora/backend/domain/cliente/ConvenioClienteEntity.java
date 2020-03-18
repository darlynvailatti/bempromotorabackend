
package br.com.bempromotora.backend.domain.cliente;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;



@Entity
@Table(name = "ConvenioCliente")
@Data
public class ConvenioClienteEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idConvenioCliente_gen")
	@SequenceGenerator(name = "idConvenioCliente_gen", sequenceName = "idConvenioCliente_seq", allocationSize = 1)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ClienteEntity cliente;

	@OneToOne(fetch = FetchType.LAZY)
	private ConvenioEntity convenio;

	@Column(name = "Matricula")
	private String matricula;

	private LocalDate dataEntrada;

	private LocalDate dataFim;

	@Override
	public Long getId(){
		return this.id;
	}

}