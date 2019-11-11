
package br.com.bempromotora.backend.domain.proposta.contrato;


import br.com.bempromotora.backend.domain.common.ArquivoEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "ContratoArquivo")
@Data
public class ContratoArquivoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idContratoArquivo_gen")
	@SequenceGenerator(name= "idContratoArquivo_gen", sequenceName="idContratoArquivo_seq", allocationSize =1)
	@Column(name = "idContratoArquivo", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ArquivoEntity arquivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idContrato")
	private ContratoEntity contrato;
	
	@Override
	public Long getId(){
		return this.id;
	};
}