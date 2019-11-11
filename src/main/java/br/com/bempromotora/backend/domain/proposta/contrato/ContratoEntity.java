
package br.com.bempromotora.backend.domain.proposta.contrato;


import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Contrato")
@Data
public class ContratoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idContrato_gen")
	@SequenceGenerator(name= "idContrato_gen", sequenceName="idContrato_seq", allocationSize =1)
	@Column(name = "idContrato", updatable = false, nullable = false)
	private Long idContrato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idVersao")
	private VersaoContratoEntity versao;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<PropostaEntity> contratoProposta;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="contrato", cascade=CascadeType.ALL)
	private List<ContratoArquivoEntity> contratoContratoArquivo;
	
	@Override
	public Long getId(){
		return getIdContrato();
	};

}