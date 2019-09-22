
package domain.parceiro;


import domain.UsuarioEntity;
import domain.cliente.ClienteEntity;

import javax.persistence.*;


@Entity
@Table(name = "PessoasFisica")
public class PessoasFisicaEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idParceiro", referencedColumnName="idParceiro")
	private ParceiroEntity parceiro;

	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "Funcionrio")
	private String funcionrio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idFuncionarioDeRepresentante")
	private PessoaJuridicaEntity funcionarioDeRepresentante;

	@OneToOne(fetch = FetchType.LAZY,mappedBy="usuario", cascade=CascadeType.ALL)
	private UsuarioEntity usuario;
	
    	
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
		return this.cpf;
	};

	public void setCPF(String cPF){
        	this.cpf = cPF;
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
	
  	public UsuarioEntity getUsuario(){
		return this.usuario;
	};
	public void setUsuario(UsuarioEntity usuario){
		this.usuario = usuario;
	};

	
    	
	
  	public ClienteEntity getClienteCliente(){
		return this.clienteCliente;
	};
	public void setClienteCliente(ClienteEntity clienteCliente ){
		this.clienteCliente=clienteCliente;
	};

	
    	
	
	
	
	
	
}