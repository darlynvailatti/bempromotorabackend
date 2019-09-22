
package domain.proposta.contrato;


import domain.proposta.contrato.ClausulaEntity;
import domain.proposta.contrato.VersaoContratoEntity;

import javax.persistence.*;


@Entity
@Table(name = "TextoContrato")
public class TextoContratoEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idVersaoModelo", referencedColumnName="idVersoesContrato")
	private VersaoContratoEntity versaoModelo;

	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idClausula", referencedColumnName="idClausula")
	private ClausulaEntity clausula;

	@Column(name = "Ordem")
	private String ordem;
	
	public VersaoContratoEntity getVersaoModelo(){
		return this.versaoModelo;
	};

	public void setVersaoModelo(VersaoContratoEntity versaoModelo){
        	this.versaoModelo = versaoModelo;
	};

	@Override
	public Long getId(){
		return getVersaoModelo().getId();
	};
	
	public ClausulaEntity getClausula(){
		return this.clausula;
	};

	public void setClausula(ClausulaEntity clausula){
        	this.clausula = clausula;
	};
	
	public String getOrdem(){
		return this.ordem;
	};

	public void setOrdem(String ordem){
        	this.ordem = ordem;
	};

}