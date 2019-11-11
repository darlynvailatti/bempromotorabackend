
package br.com.bempromotora.backend.domain.proposta.contrato;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
 

@Entity
@Table(name = "ModeloContrato")
@Data
public class ModeloContratoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idModeloContrato_gen")
	@SequenceGenerator(name = "idModeloContrato_gen", sequenceName = "idModeloContrato_seq", allocationSize = 1)
	@Column(name = "idModeloContrato", updatable = false, nullable = false)
	private Long idModeloContrato;

	@Column(name = "Nome")
	private String nome;

	@Override
	public Long getId() {
		return getIdModeloContrato();
	}


}