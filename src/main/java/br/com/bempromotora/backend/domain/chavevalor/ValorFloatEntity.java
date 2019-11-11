
package br.com.bempromotora.backend.domain.chavevalor;

import lombok.Data;

import java.math.BigDecimal;
import javax.persistence.*;


@Entity
@Table(name = "ValorFloat")
@Data
public class ValorFloatEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=" ValorFloat_gen")
	@SequenceGenerator(name= " ValorFloat_gen", sequenceName=" ValorFloat_seq", allocationSize =1)
	@Column(name = "idValorFloat", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "ValorFloat")
	private BigDecimal valorFloat;
	
	@Override
	public Long getId(){
		return this.id;
	};

}