
package domain;


import javax.persistence.*;
import java.util.List;

 

@Entity
@Table(name = "OpcaoDeCampo")
public class OpcaoDeCampoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idOpcao_gen")
	@SequenceGenerator(name= "idOpcao_gen", sequenceName="idOpcao_seq", allocationSize =1)
	@Column(name = "idOpcao", updatable = false, nullable = false)
	private Long idOpcao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idCampo")
	private CampoDeEntidadeEntity campo;
	@Column(name = "NomeLogico")
	private String nomeLogico;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="opcao", cascade=CascadeType.ALL)
	private List<AliasEntity> opcaoAlias;
	
    	
	

	// gets e sets
	public Long getIdOpcao(){
		return this.idOpcao;
	};

    	public void setIdOpcao(Long idOpcao){
        	this.idOpcao = idOpcao;
	};
	
	@Override
	public Long getId(){
		return getIdOpcao();
	};
	
	public CampoDeEntidadeEntity getCampo(){
		return this.campo;
	};

    	public void setCampo(CampoDeEntidadeEntity campo){
        	this.campo = campo;
	};
	
	public String getNomeLogico(){
		return this.nomeLogico;
	};

	public void setNomeLogico(String nomeLogico){
        	this.nomeLogico = nomeLogico;
	};
	
	
	
	//novos
	
  	public List<AliasEntity> getOpcaoAlias(){
		return this.opcaoAlias;
	};
	public void setOpcaoAlias(List<AliasEntity> opcaoAlias ){
		this.opcaoAlias=opcaoAlias;
	}
	
    	
	
	
	
	
	
}