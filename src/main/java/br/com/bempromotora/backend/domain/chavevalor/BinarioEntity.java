
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Binario")
@Data
public class BinarioEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idBinario_gen")
	@SequenceGenerator(name= "idBinario_gen", sequenceName="idBinario_seq", allocationSize =1)
	@Column(name = "idBinario", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "HashBinarioComDiferencial")
	private String hashBinarioComDiferencial;
	
	@Column(name = "Binario")
	private byte[] binario;

	@Override
	public Long getId(){
		return this.id;
	};

}