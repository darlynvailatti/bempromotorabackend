
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Texto")
@Data
public class TextoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Texto_gen")
	@SequenceGenerator(name= "Texto_gen", sequenceName="Texto_seq", allocationSize =1)
	@Column(name = "idTexto", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "HashTextoComDiferencial")
	private String hashTextoComDiferencial;
	
	@Column(name = "Texto")
	private String texto;
	
	@Override
	public Long getId(){
		return this.id;
	};
	
}