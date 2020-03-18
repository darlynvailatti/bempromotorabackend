
package br.com.bempromotora.backend.domain.parceiro;


import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import br.com.bempromotora.backend.domain.cliente.ClienteEntity;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "PessoasFisica")
@Data
public class PessoasFisicaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idParceiro_gen")
	@SequenceGenerator(name = "idParceiro_gen", sequenceName = "idParceiro_seq", allocationSize = 1)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ParceiroEntity parceiro;

	@Column(name = "CPF")
	private String cpf;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFuncionarioDeRepresentante")
	private PessoaJuridicaEntity funcionarioDeRepresentante;

	@Override
	public Long getId(){
		return this.id;
	};

}