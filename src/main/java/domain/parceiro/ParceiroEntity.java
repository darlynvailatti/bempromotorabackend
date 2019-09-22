
package domain.parceiro;


import domain.DocumentoEntity;
import domain.NotificacaoEntity;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Parceiro")
public class ParceiroEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idParceiro_gen")
	@SequenceGenerator(name= "idParceiro_gen", sequenceName="idParceiro_seq", allocationSize =1)
	@Column(name = "idParceiro", updatable = false, nullable = false)
	private Long idParceiro;
	
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
	private List<NotificacaoEntity> parceiroNotificadoNotificacao;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiroNotificador", cascade=CascadeType.ALL)
	private List<NotificacaoEntity> parceiroNotificadorNotificacao;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="parceiro", cascade=CascadeType.ALL)
	private List<DocumentoEntity> parceiroDocumento;
	
    	
	

	// gets e sets
	public Long getIdParceiro(){
		return this.idParceiro;
	};

    	public void setIdParceiro(Long idParceiro){
        	this.idParceiro = idParceiro;
	};
	
	@Override
	public Long getId(){
		return getIdParceiro();
	};
	
	public String getApelido(){
		return this.apelido;
	};

	public void setApelido(String apelido){
        	this.apelido = apelido;
	};
	
	public String getAtivo(){
		return this.ativo;
	};

	public void setAtivo(String ativo){
        	this.ativo = ativo;
	};
	
	
	
	//novos
	
  	public List<InformacaoBancariaEntity> getParceiroInformacaoBancaria(){
		return this.parceiroInformacaoBancaria;
	};
	public void setParceiroInformacaoBancaria(List<InformacaoBancariaEntity> parceiroInformacaoBancaria ){
		this.parceiroInformacaoBancaria=parceiroInformacaoBancaria;
	}
	
    	
	
  	public List<LocalidadeEntity> getParceiroLocalidade(){
		return this.parceiroLocalidade;
	};
	public void setParceiroLocalidade(List<LocalidadeEntity> parceiroLocalidade ){
		this.parceiroLocalidade=parceiroLocalidade;
	}
	
    	
	
  	public PessoaJuridicaEntity getParceiroPessoaJuridica(){
		return this.parceiroPessoaJuridica;
	};
	public void setParceiroPessoaJuridica(PessoaJuridicaEntity parceiroPessoaJuridica ){
		this.parceiroPessoaJuridica=parceiroPessoaJuridica;
	};

	
    	
	
  	public PessoasFisicaEntity getParceiroPessoasFisica(){
		return this.parceiroPessoasFisica;
	};
	public void setParceiroPessoasFisica(PessoasFisicaEntity parceiroPessoasFisica ){
		this.parceiroPessoasFisica=parceiroPessoasFisica;
	};

	
    	
	
  	public List<NotificacaoEntity> getParceiroNotificadoNotificacao(){
		return this.parceiroNotificadoNotificacao;
	};
	public void setParceiroNotificadoNotificacao(List<NotificacaoEntity> parceiroNotificadoNotificacao ){
		this.parceiroNotificadoNotificacao=parceiroNotificadoNotificacao;
	}
	
    	
	public List<NotificacaoEntity> getParceiroNotificadorNotificacao(){
		return this.parceiroNotificadorNotificacao;
	};
	public void setParceiroNotificadorNotificacao(List<NotificacaoEntity> parceiroNotificadorNotificacao ){
		this.parceiroNotificadorNotificacao=parceiroNotificadorNotificacao;
	}
	
    	
	
  	public List<DocumentoEntity> getParceiroDocumento(){
		return this.parceiroDocumento;
	};
	public void setParceiroDocumento(List<DocumentoEntity> parceiroDocumento ){
		this.parceiroDocumento=parceiroDocumento;
	}
	
    	
	
	
	
	
	
}