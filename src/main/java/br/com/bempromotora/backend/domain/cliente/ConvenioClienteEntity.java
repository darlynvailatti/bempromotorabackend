
package br.com.bempromotora.backend.domain.cliente;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "ConvenioCliente")
@Data
@Builder
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

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "conteudo", column = @Column(name = "DATA_INICIO"))
	})
	private br.com.bempromotora.backend.common.Data dataEntrada;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "conteudo", column = @Column(name = "DATA_FIM"))
	})
	private br.com.bempromotora.backend.common.Data dataFim;

	@Override
	public Long getId(){
		return this.id;
	}

}