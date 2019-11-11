
package br.com.bempromotora.backend.domain.proposta;


import br.com.bempromotora.backend.domain.common.ArquivoEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "PropostaArquivo")
@Data
public class PropostaArquivoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idPropostaArquivo_gen")
	@SequenceGenerator(name= "idPropostaArquivo_gen", sequenceName="idPropostaArquivo_seq", allocationSize =1)
	@Column(name = "idPropostaArquivo", updatable = false, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idArquivo")
	private ArquivoEntity arquivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProposta")
	private PropostaEntity proposta;

	@Override
	public Long getId(){
		return this.id;
	};

}