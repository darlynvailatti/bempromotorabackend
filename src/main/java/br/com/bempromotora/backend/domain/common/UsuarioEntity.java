
package br.com.bempromotora.backend.domain.common;


import br.com.bempromotora.backend.domain.parceiro.PessoasFisicaEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
@Data
public class UsuarioEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idUsuario_gen")
	@SequenceGenerator(name= "idUsuario_gen", sequenceName="idUsuario_seq", allocationSize =1)
	@Column(name = "idUsuario", updatable = false, nullable = false)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private PessoasFisicaEntity pessoaFisica;

	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "Ativo")
	private String ativo;

	@Override
	public Long getId(){
		return this.id;
	};

}