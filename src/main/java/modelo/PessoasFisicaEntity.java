
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ClienteEntity;
import modelo.ParceiroEntity;
import modelo.PessoaJuridicaEntity;
import modelo.UsuarioEntity;

import java.util.List;

 

@Entity
@Table(name = "PessoasFisica")
public class PessoasFisicaEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idParceiro", referencedColumnName="idParceiro")
	
	private ParceiroEntity parceiro;
	@Column(name = "CPF")
	private String cPF;
	
	@Column(name = "Funcionrio")
	private String funcionrio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFuncionarioDeRepresentante")
	private PessoaJuridicaEntity funcionarioDeRepresentante;
	@OneToOne(fetch = FetchType.LAZY,mappedBy="usuario", cascade=CascadeType.ALL)
	private UsuarioEntity usuarioUsuario;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	private ClienteEntity clienteCliente;
	
    	
	

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
	
	public String getCPF(){
		return this.cPF;
	};

	public void setCPF(String cPF){
        	this.cPF = cPF;
	};
	
	public String getFuncionrio(){
		return this.funcionrio;
	};

	public void setFuncionrio(String funcionrio){
        	this.funcionrio = funcionrio;
	};
	
	public PessoaJuridicaEntity getFuncionarioDeRepresentante(){
		return this.funcionarioDeRepresentante;
	};

    	public void setFuncionarioDeRepresentante(PessoaJuridicaEntity funcionarioDeRepresentante){
        	this.funcionarioDeRepresentante = funcionarioDeRepresentante;
	};
	
	
	
	//novos
	
  	public UsuarioEntity getUsuarioUsuario(){
		return this.usuarioUsuario;
	};
	public void setUsuarioUsuario(UsuarioEntity usuarioUsuario ){
		this.usuarioUsuario=usuarioUsuario;
	};

	
    	
	
  	public ClienteEntity getClienteCliente(){
		return this.clienteCliente;
	};
	public void setClienteCliente(ClienteEntity clienteCliente ){
		this.clienteCliente=clienteCliente;
	};

	
    	
	
	
	
	
	
}