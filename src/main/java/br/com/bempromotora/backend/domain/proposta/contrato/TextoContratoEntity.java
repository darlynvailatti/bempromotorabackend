
package br.com.bempromotora.backend.domain.proposta.contrato;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "TextoContrato")
@Data
public class TextoContratoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idTextoContrato_gen")
	@SequenceGenerator(name = "idTextoContrato_gen", sequenceName = "idTextoContrato_seq", allocationSize = 1)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private VersaoContratoEntity versaoModelo;

	@OneToOne(fetch = FetchType.LAZY)
	private ClausulaEntity clausula;

	@Column(name = "Ordem")
	private String ordem;

	@Override
	public Long getId(){
		return this.id;
	};

}