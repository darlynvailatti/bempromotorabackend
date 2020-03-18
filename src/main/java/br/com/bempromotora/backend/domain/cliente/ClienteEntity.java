
package br.com.bempromotora.backend.domain.cliente;

import br.com.bempromotora.backend.domain.parceiro.PessoasFisicaEntity;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Cliente")
@Data
public class ClienteEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCliente_gen")
	@SequenceGenerator(name = "idCliente_gen", sequenceName = "idCliente_seq", allocationSize = 1)
	private Long id;

	@OneToOne
	private PessoasFisicaEntity pessoaFisica;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "DataNascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "Bloqueado")
	private Boolean bloqueado;

	@Override
	public Long getId(){
		return this.id;
	}

}