
package domain;


import javax.persistence.*;


@Entity
@Table(name = "PropostaArquivo")
public class PropostaArquivoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProposta")
	private PropostaEntity proposta;
	

	// gets e sets
	public ArquivoEntity getArquivo(){
		return this.arquivo;
	};

    	public void setArquivo(ArquivoEntity arquivo){
        	this.arquivo = arquivo;
	};
	@Override
	public Long getId(){
		return getArquivo().getId();
	};
	
	public PropostaEntity getProposta(){
		return this.proposta;
	};

    	public void setProposta(PropostaEntity proposta){
        	this.proposta = proposta;
	};
	
	
	
	//novos
	
	
	
	
	
}