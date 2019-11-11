
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "ValoreOpcao")
@Data
public class ValorOpcaoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ValorOpcao_gen")
	@SequenceGenerator(name= "ValorOpcao_gen", sequenceName="ValorOpcao_seq", allocationSize =1)
	@Column(name = "idValorOpcao", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "ValorDeOpcao")
	private String valorDeOpcao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudo", cascade=CascadeType.ALL)
	private Set<AliasEntity> aliases;
	
	@Override
	public Long getId(){
		return this.id;
	};

}