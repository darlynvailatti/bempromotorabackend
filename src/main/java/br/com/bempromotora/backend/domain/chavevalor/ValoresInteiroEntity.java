
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "ValoresInteiro")
@Data
public class ValoresInteiroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator=" ValoresInteiro_gen")
	@SequenceGenerator(name= " ValoresInteiro_gen", sequenceName=" ValoresInteiro_seq", allocationSize =1)
	@Column(name = "idValoresInteiro", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "ValorInteiro")
	private Integer valorInteiro;
	
	@Override
	public Long getId(){
		return this.id;
	};
	
}