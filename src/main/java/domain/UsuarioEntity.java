
package domain;


import domain.parceiro.PessoasFisicaEntity;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idUsuario", referencedColumnName="idPessoasFisica")
	private PessoasFisicaEntity pessoaFisica;

	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "Ativo")
	private String ativo;
	
	public PessoasFisicaEntity getPessoaFisica(){
		return this.pessoaFisica;
	};

	public void setPessoaFisica(PessoasFisicaEntity pessoaFisica){
        	this.pessoaFisica = pessoaFisica;
	};

    	@Override
	public Long getId(){
		return getPessoaFisica().getId();
	};
	
	public String getSenha(){
		return this.senha;
	};

	public void setSenha(String senha){
        	this.senha = senha;
	};
	
	public String getAtivo(){
		return this.ativo;
	};

	public void setAtivo(String ativo){
        	this.ativo = ativo;
	};

	
}