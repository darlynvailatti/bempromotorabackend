
package domain;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Usuario")
public class UsuarioEntity extends domain.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idUsuario", referencedColumnName="idPessoasFisica")
	private PessoasFisicaEntity pessoaFisica;

	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "Ativo")
	private String ativo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="pessoaFisica", cascade=CascadeType.ALL)
	private List<EvolucaoPropostaEntity> usuarioEvolucoesDaProposta;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="pessoaFisica", cascade=CascadeType.ALL)
	private List<PropostaEntity> usuarioProposta;
	
    	
	

	// gets e sets
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
	
	
	
	//novos
	
  	public List<EvolucaoPropostaEntity> getUsuarioEvolucoesDaProposta(){
		return this.usuarioEvolucoesDaProposta;
	};
	public void setUsuarioEvolucoesDaProposta(List<EvolucaoPropostaEntity> usuarioEvolucoesDaProposta ){
		this.usuarioEvolucoesDaProposta=usuarioEvolucoesDaProposta;
	}
	
    	
	
  	public List<PropostaEntity> getUsuarioProposta(){
		return this.usuarioProposta;
	};
	public void setUsuarioProposta(List<PropostaEntity> usuarioProposta ){
		this.usuarioProposta=usuarioProposta;
	}
	
    	
	
	
	
	
	
}