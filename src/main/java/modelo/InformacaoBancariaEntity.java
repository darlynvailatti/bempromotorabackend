
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.LocalidadeEntity;
import modelo.ParceiroEntity;

import java.util.List;

 

@Entity
@Table(name = "InformacaoBancaria")
public class InformacaoBancariaEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idInformacaoBancaria_gen")
	@SequenceGenerator(name= "idInformacaoBancaria_gen", sequenceName="idInformacaoBancaria_seq", allocationSize =1)
	@Column(name = "idInformacaoBancaria", updatable = false, nullable = false)
	private Long idInformacaoBancaria;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiro")
	private ParceiroEntity parceiro;
	@Column(name = "Banco")
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
	
    	
	

	// gets e sets
	public Long getIdInformacaoBancaria(){
		return this.idInformacaoBancaria;
	};

    	public void setIdInformacaoBancaria(Long idInformacaoBancaria){
        	this.idInformacaoBancaria = idInformacaoBancaria;
	};
	
	@Override
	public Long getId(){
		return getIdInformacaoBancaria();
	};
	
	public ParceiroEntity getParceiro(){
		return this.parceiro;
	};

    	public void setParceiro(ParceiroEntity parceiro){
        	this.parceiro = parceiro;
	};
	
	public String getBanco(){
		return this.banco;
	};

	public void setBanco(String banco){
        	this.banco = banco;
	};
	
	public String getAgencia(){
		return this.agencia;
	};

	public void setAgencia(String agencia){
        	this.agencia = agencia;
	};
	
	public String getConta(){
		return this.conta;
	};

	public void setConta(String conta){
        	this.conta = conta;
	};
	
	public String getAtiva(){
		return this.ativa;
	};

	public void setAtiva(String ativa){
        	this.ativa = ativa;
	};
	
	public String getRecebimentoOuPagamento(){
		return this.recebimentoOuPagamento;
	};

	public void setRecebimentoOuPagamento(String recebimentoOuPagamento){
        	this.recebimentoOuPagamento = recebimentoOuPagamento;
	};
	
	
	
	//novos
	
  	public List<LocalidadeEntity> getInformacaoBancariaLocalidade(){
		return this.informacaoBancariaLocalidade;
	};
	public void setInformacaoBancariaLocalidade(List<LocalidadeEntity> informacaoBancariaLocalidade ){
		this.informacaoBancariaLocalidade=informacaoBancariaLocalidade;
	}
	
    	
	
	
	
	
	
}