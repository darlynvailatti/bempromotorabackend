
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "HashSenha")
@Data
public class HashSenhaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idHashSenha_gen")
	@SequenceGenerator(name= "idHashSenha_gen", sequenceName="idHashSenha_seq", allocationSize =1)
	@Column(name = "idHashSenha", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "HashSenhas")
	private String hashSenhas;
	

	@Override
	public Long getId(){
		return this.id;
	};
}