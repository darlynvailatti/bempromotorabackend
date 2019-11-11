
package br.com.bempromotora.backend.domain.parceiro;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Logradouro")
@Data
public class LogradouroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idLogradouro_gen")
	@SequenceGenerator(name= "idLogradouro_gen", sequenceName="idLogradouro_seq", allocationSize =1)
	@Column(name = "idLogradouro", updatable = false, nullable = false)
	private Long idLogradouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idLocalidade")
	private LocalidadeEntity localidade;

	@Column(name = "EnderecoEntity")
	private String endereco;
	
	@Column(name = "Numero")
	private String numero;
	
	@Column(name = "Complemento")
	private String complemento;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(name = "CEP")
	private String cEP;

	@Override
	public Long getId(){
		return getIdLogradouro();
	};

}