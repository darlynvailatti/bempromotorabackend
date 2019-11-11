
package br.com.bempromotora.backend.domain.parceiro;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "InformacaoBancaria")
@Data
public class InformacaoBancariaEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idInformacaoBancaria_gen")
	@SequenceGenerator(name= "idInformacaoBancaria_gen", sequenceName="idInformacaoBancaria_seq", allocationSize =1)
	@Column(name = "idInformacaoBancaria", updatable = false, nullable = false)
	private Long idInformacaoBancaria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiro")
	private ParceiroEntity parceiro;
	@Column(name = "BancoEntity")
	private String banco;
	
	@Column(name = "Agencia")
	private String agencia;
	
	@Column(name = "Conta")
	private String conta;
	
	@Column(name = "Ativa")
	private String ativa;
	
	@Column(name = "RecebimentoOuPagamento")
	private String recebimentoOuPagamento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="informacaoBancaria", cascade=CascadeType.ALL)
	private List<LocalidadeEntity> informacaoBancariaLocalidade;
	
	@Override
	public Long getId(){
		return getIdInformacaoBancaria();
	};

}