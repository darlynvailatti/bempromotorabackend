
package br.com.bempromotora.backend.domain.parceiro;


import br.com.bempromotora.backend.domain.common.DocumentoEntity;
import br.com.bempromotora.backend.domain.common.NotificacaoEntity;
import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Parceiro")
@Data
public class ParceiroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idParceiro_gen")
	@SequenceGenerator(name= "idParceiro_gen", sequenceName="idParceiro_seq", allocationSize =1)
	private Long id;
	
	@Column(name = "Apelido")
	private String apelido;
	
	@Column(name = "Ativo")
	private String ativo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiro", cascade=CascadeType.ALL)
	private List<InformacaoBancariaEntity> parceiroInformacaoBancaria;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiro", cascade=CascadeType.ALL)
	private List<LocalidadeEntity> parceiroLocalidade;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="parceiro", cascade=CascadeType.ALL)
	private PessoaJuridicaEntity parceiroPessoaJuridica;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="parceiro", cascade=CascadeType.ALL)
	private PessoasFisicaEntity parceiroPessoasFisica;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiroNotificado", cascade=CascadeType.ALL)
	private List<NotificacaoEntity> parceiroNotificado;
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiro", cascade=CascadeType.ALL)
	private List<DocumentoParceiroEntity> parceiroDocumento;
	
	@Override
	public Long getId(){
		return this.id;
	};

}