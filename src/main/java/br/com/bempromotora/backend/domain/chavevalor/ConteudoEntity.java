
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "Conteudo")
@Data
public class ConteudoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idConteudo_gen")
	@SequenceGenerator(name= "idConteudo_gen", sequenceName="idConteudo_seq", allocationSize =1)
	@Column(name = "idConteudo", updatable = false, nullable = false)
	private Long idConteudo;
	
	@Column(name = "HashBase")
	private String hashBase;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", cascade=CascadeType.ALL)
	private List<PermissaoEntity> usuarioPermissao;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private HashSenhaEntity conteudoHashSenha;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudo", cascade=CascadeType.ALL)
	private List<OpcaoCampoEntity> conteudoOpcaoDeCampo;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudoDefault", cascade=CascadeType.ALL)
	private List<CampoDeEntidadeEntity> conteudoDefaultCampoDeEntidade;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="conteudo", cascade=CascadeType.ALL)
	private List<InformacaoEntity> informacoes;

    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private BinarioEntity conteudoBinario;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private ValorOpcaoEntity conteudoValoresDeOpcao;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private ValorFloatEntity conteudoValorFloat;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private DataEntity conteudoData;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private TextoEntity conteudoTexto;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="conteudo", cascade=CascadeType.ALL)
	private ValoresInteiroEntity conteudoValoresInteiro;
	

	@Override
	public Long getId(){
		return getIdConteudo();
	};
	
	
}