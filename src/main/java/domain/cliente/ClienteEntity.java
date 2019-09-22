
package domain.cliente;

import domain.parceiro.PessoasFisicaEntity;
import domain.proposta.PropostaEntity;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Cliente")
public class ClienteEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idCliente", referencedColumnName="idPessoasFisica")
	private PessoasFisicaEntity cliente;

	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "DataNascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "Bloqueado")
	private String bloqueado;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="cliente", cascade=CascadeType.ALL)
	private ConvenioClienteEntity clienteConveniosDoCliente;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="cliente", cascade=CascadeType.ALL)
	private List<PropostaEntity> clienteProposta;
	
    	
	

	// gets e sets
	public PessoasFisicaEntity getCliente(){
		return this.cliente;
	};

    	public void setCliente(PessoasFisicaEntity cliente){
        	this.cliente = cliente;
	};
	@Override
	public Long getId(){
		return getCliente().getId();
	};
	
	public String getNome(){
		return this.nome;
	};

	public void setNome(String nome){
        	this.nome = nome;
	};
	
	public LocalDate getDataNascimento(){
		return this.dataNascimento;
	};

	public void setDataNascimento(LocalDate dataNascimento){
        	this.dataNascimento = dataNascimento;
	};
	
	public String getBloqueado(){
		return this.bloqueado;
	};

	public void setBloqueado(String bloqueado){
        	this.bloqueado = bloqueado;
	};
	
	
	
	//novos
	
  	public ConvenioClienteEntity getClienteConveniosDoCliente(){
		return this.clienteConveniosDoCliente;
	};
	public void setClienteConveniosDoCliente(ConvenioClienteEntity clienteConveniosDoCliente ){
		this.clienteConveniosDoCliente=clienteConveniosDoCliente;
	};

	
    	
	
  	public List<PropostaEntity> getClienteProposta(){
		return this.clienteProposta;
	};
	public void setClienteProposta(List<PropostaEntity> clienteProposta ){
		this.clienteProposta=clienteProposta;
	}
	
    	
	
	
	
	
	
}