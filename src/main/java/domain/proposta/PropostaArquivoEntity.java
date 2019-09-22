
package domain.proposta;


import domain.ArquivoEntity;
import domain.proposta.PropostaEntity;

import javax.persistence.*;


@Entity
@Table(name = "PropostaArquivo")
public class PropostaArquivoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idArquivo")
	private ArquivoEntity arquivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idProposta")
	private PropostaEntity proposta;
	

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

}