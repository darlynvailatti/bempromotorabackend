
package domain.chavevalor;


import javax.persistence.*;

import java.util.List;


@Entity
@Table(name = "Conteudo")
public class ConteudoEntity extends architecture.AbstractEntity
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
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="nteudo", cascade=CascadeType.ALL)
	private List<InformacaoEntity> informacoe;

    	
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
	
    	
	

	// gets e sets
	public Long getIdConteudo(){
		return this.idConteudo;
	};

    	public void setIdConteudo(Long idConteudo){
        	this.idConteudo = idConteudo;
	};
	
	@Override
	public Long getId(){
		return getIdConteudo();
	};
	
	public String getHashBase(){
		return this.hashBase;
	};

	public void setHashBase(String hashBase){
        	this.hashBase = hashBase;
	};
	
	
	
	//novos
	
  	public List<PermissaoEntity> getUsuarioPermissao(){
		return this.usuarioPermissao;
	};
	public void setUsuarioPermissao(List<PermissaoEntity> usuarioPermissao ){
		this.usuarioPermissao=usuarioPermissao;
	}
	
    	
	
  	public HashSenhaEntity getConteudoHashSenha(){
		return this.conteudoHashSenha;
	};
	public void setConteudoHashSenha(HashSenhaEntity conteudoHashSenha ){
		this.conteudoHashSenha=conteudoHashSenha;
	};

	
    	
	
  	public List<OpcaoCampoEntity> getConteudoOpcaoDeCampo(){
		return this.conteudoOpcaoDeCampo;
	};
	public void setConteudoOpcaoDeCampo(List<OpcaoCampoEntity> conteudoOpcaoDeCampo ){
		this.conteudoOpcaoDeCampo=conteudoOpcaoDeCampo;
	}
	
    	
	
  	public List<CampoDeEntidadeEntity> getConteudoDefaultCampoDeEntidade(){
		return this.conteudoDefaultCampoDeEntidade;
	};
	public void setConteudoDefaultCampoDeEntidade(List<CampoDeEntidadeEntity> conteudoDefaultCampoDeEntidade ){
		this.conteudoDefaultCampoDeEntidade=conteudoDefaultCampoDeEntidade;
	}
	
    	
	
  	public List<InformacaoEntity> getInformacoe(){
		return this.informacoe;
	};
	public void setInformacoe(List<InformacaoEntity> informacoe){
		this.informacoe = informacoe;
	}
	
    	
	
  	public BinarioEntity getConteudoBinario(){
		return this.conteudoBinario;
	};
	public void setConteudoBinario(BinarioEntity conteudoBinario ){
		this.conteudoBinario=conteudoBinario;
	};

	
    	
	
  	public ValorOpcaoEntity getConteudoValoresDeOpcao(){
		return this.conteudoValoresDeOpcao;
	};
	public void setConteudoValoresDeOpcao(ValorOpcaoEntity conteudoValoresDeOpcao ){
		this.conteudoValoresDeOpcao=conteudoValoresDeOpcao;
	};

	
    	
	
  	public ValorFloatEntity getConteudoValorFloat(){
		return this.conteudoValorFloat;
	};
	public void setConteudoValorFloat(ValorFloatEntity conteudoValorFloat ){
		this.conteudoValorFloat=conteudoValorFloat;
	};

	
    	
	
  	public DataEntity getConteudoData(){
		return this.conteudoData;
	};
	public void setConteudoData(DataEntity conteudoData ){
		this.conteudoData=conteudoData;
	};

	
    	
	
  	public TextoEntity getConteudoTexto(){
		return this.conteudoTexto;
	};
	public void setConteudoTexto(TextoEntity conteudoTexto ){
		this.conteudoTexto=conteudoTexto;
	};

	
    	
	
  	public ValoresInteiroEntity getConteudoValoresInteiro(){
		return this.conteudoValoresInteiro;
	};
	public void setConteudoValoresInteiro(ValoresInteiroEntity conteudoValoresInteiro ){
		this.conteudoValoresInteiro=conteudoValoresInteiro;
	};

	
    	
	
	
	
	
	
}