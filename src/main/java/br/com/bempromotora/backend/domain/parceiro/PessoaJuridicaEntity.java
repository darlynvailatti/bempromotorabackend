
package br.com.bempromotora.backend.domain.parceiro;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "PessoaJuridica")
@Data
public class PessoaJuridicaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idParceiro_gen")
	@SequenceGenerator(name= "idParceiro_gen", sequenceName="idParceiro_seq", allocationSize =1)
	@Column(name = "idParceiro", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ParceiroEntity parceiro;

	@Column(name = "CNPJ")
	private String cNPJ;
	
	@Column(name = "RazaoSocial")
	private String razaoSocial;
	
	@Column(name = "Representante")
	private String representante;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="funcionarioDeRepresentante", cascade=CascadeType.ALL)
	private List<PessoasFisicaEntity> funcionarioDeRepresentantePessoasFisica;

	@Override
	public Long getId(){
		return this.id;
	};

}