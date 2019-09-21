
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.EvolucoesDaPropostaEntity;
import modelo.PessoasFisicaEntity;
import modelo.PropostaEntity;

import java.util.List;

 

@Entity
@Table(name = "Usuario")
public class UsuarioEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idUsuario", referencedColumnName="idPessoasFisica")
	
	private PessoasFisicaEntity usuario;
	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "Ativo")
	private String ativo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", cascade=CascadeType.ALL)
	private List<EvolucoesDaPropostaEntity> usuarioEvolucoesDaProposta;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", cascade=CascadeType.ALL)
	private List<PropostaEntity> usuarioProposta;
	
    	
	

	// gets e sets
	public PessoasFisicaEntity getUsuario(){
		return this.usuario;
	};

    	public void setUsuario(PessoasFisicaEntity usuario){
        	this.usuario = usuario;
	};
	@Override
	public Long getId(){
		return getUsuario().getId();
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
	
  	public List<EvolucoesDaPropostaEntity> getUsuarioEvolucoesDaProposta(){
		return this.usuarioEvolucoesDaProposta;
	};
	public void setUsuarioEvolucoesDaProposta(List<EvolucoesDaPropostaEntity> usuarioEvolucoesDaProposta ){
		this.usuarioEvolucoesDaProposta=usuarioEvolucoesDaProposta;
	}
	
    	
	
  	public List<PropostaEntity> getUsuarioProposta(){
		return this.usuarioProposta;
	};
	public void setUsuarioProposta(List<PropostaEntity> usuarioProposta ){
		this.usuarioProposta=usuarioProposta;
	}
	
    	
	
	
	
	
	
}