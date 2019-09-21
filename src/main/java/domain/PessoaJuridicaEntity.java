
package domain;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "PessoaJuridica")
public class PessoaJuridicaEntity extends domain.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idParceiro", referencedColumnName="idParceiro")
	
	private ParceiroEntity parceiro;
	@Column(name = "CNPJ")
	private String cNPJ;
	
	@Column(name = "RazaoSocial")
	private String razaoSocial;
	
	@Column(name = "Representante")
	private String representante;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="funcionarioDeRepresentante", cascade=CascadeType.ALL)
	private List<PessoasFisicaEntity> funcionarioDeRepresentantePessoasFisica;
	
    	
	

	// gets e sets
	public ParceiroEntity getParceiro(){
		return this.parceiro;
	};

    	public void setParceiro(ParceiroEntity parceiro){
        	this.parceiro = parceiro;
	};
	@Override
	public Long getId(){
		return getParceiro().getId();
	};
	
	public String getCNPJ(){
		return this.cNPJ;
	};

	public void setCNPJ(String cNPJ){
        	this.cNPJ = cNPJ;
	};
	
	public String getRazaoSocial(){
		return this.razaoSocial;
	};

	public void setRazaoSocial(String razaoSocial){
        	this.razaoSocial = razaoSocial;
	};
	
	public String getRepresentante(){
		return this.representante;
	};

	public void setRepresentante(String representante){
        	this.representante = representante;
	};
	
	
	
	//novos
	
  	public List<PessoasFisicaEntity> getFuncionarioDeRepresentantePessoasFisica(){
		return this.funcionarioDeRepresentantePessoasFisica;
	};
	public void setFuncionarioDeRepresentantePessoasFisica(List<PessoasFisicaEntity> funcionarioDeRepresentantePessoasFisica ){
		this.funcionarioDeRepresentantePessoasFisica=funcionarioDeRepresentantePessoasFisica;
	}
	
    	
	
	
	
	
	
}