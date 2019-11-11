
package br.com.bempromotora.backend.domain.proposta.contrato;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "VersaoContrato")
@Data
public class VersaoContratoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idVersaoContrato_gen")
	@SequenceGenerator(name= "idVersaoContrato_gen", sequenceName="idVersaoContrato_seq", allocationSize =1)
	@Column(name = "idVersaoContrato", updatable = false, nullable = false)
	private Long idVersaoContrato;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ModelodeContrato")
	private ModeloContratoEntity delodeContrato;

	@Column(name = "TextoInicial")
	private byte[] textoInicial;
	
	@Column(name = "TextoFinal")
	private byte[] textoFinal;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "conteudo", column = @Column(name = "DATA_INI"))
	})
	private br.com.bempromotora.backend.common.Data dataIniVigencia;

	@Embedded
	@AttributeOverrides(value = {
			@AttributeOverride(name = "conteudo", column = @Column(name = "DATA_FIM"))
	})
	private br.com.bempromotora.backend.common.Data dataFimVigencial;
	
	@Override
	public Long getId(){
		return this.idVersaoContrato;
	};
	
}