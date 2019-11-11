
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
	private PessoasFisicaEntity cliente;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "DataNascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "Bloqueado")
	private String bloqueado;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	private ConvenioClienteEntity clienteConveniosDoCliente;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cliente", cascade=CascadeType.ALL)
	private List<PropostaEntity> clienteProposta;

	@Override
	public Long getId(){
		return this.id;
	}

}