
package domain.parceiro;


import javax.persistence.*;


@Entity
@Table(name = "Logradouro")
public class LogradouroEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idLogradouro_gen")
	@SequenceGenerator(name= "idLogradouro_gen", sequenceName="idLogradouro_seq", allocationSize =1)
	@Column(name = "idLogradouro", updatable = false, nullable = false)
	private Long idLogradouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idLocalidade")
	private LocalidadeEntity localidade;
	@Column(name = "EnderecoEntity")
	private String endereco;
	
	@Column(name = "Numero")
	private String numero;
	
	@Column(name = "Complemento")
	private String complemento;
	
	@Column(name = "Bairro")
	private String bairro;
	
	@Column(name = "CEP")
	private String cEP;
	
	

	// gets e sets
	public Long getIdLogradouro(){
		return this.idLogradouro;
	};

    	public void setIdLogradouro(Long idLogradouro){
        	this.idLogradouro = idLogradouro;
	};
	
	@Override
	public Long getId(){
		return getIdLogradouro();
	};
	
	public LocalidadeEntity getLocalidade(){
		return this.localidade;
	};

    	public void setLocalidade(LocalidadeEntity localidade){
        	this.localidade = localidade;
	};
	
	public String getEndereco(){
		return this.endereco;
	};

	public void setEndereco(String endereco){
        	this.endereco = endereco;
	};
	
	public String getNumero(){
		return this.numero;
	};

	public void setNumero(String numero){
        	this.numero = numero;
	};
	
	public String getComplemento(){
		return this.complemento;
	};

	public void setComplemento(String complemento){
        	this.complemento = complemento;
	};
	
	public String getBairro(){
		return this.bairro;
	};

	public void setBairro(String bairro){
        	this.bairro = bairro;
	};
	
	public String getCEP(){
		return this.cEP;
	};

	public void setCEP(String cEP){
        	this.cEP = cEP;
	};
	
	
	
	//novos
	
	
	
	
	
}