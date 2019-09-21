
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ClausulaEntity;
import modelo.VersoesContratoEntity;

import java.util.List;
 

@Entity
@Table(name = "TextosDoContrato")
public class TextosDoContratoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idVersaoModelo", referencedColumnName="idVersoesContrato")
	
	private VersoesContratoEntity versaoModelo;
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idClausula", referencedColumnName="idClausula")
	
	private ClausulaEntity clausula;
	@Column(name = "Ordem")
	private String ordem;
	
	

	// gets e sets
	public VersoesContratoEntity getVersaoModelo(){
		return this.versaoModelo;
	};

    	public void setVersaoModelo(VersoesContratoEntity versaoModelo){
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
	@Override
	public Long getId(){
		return getClausula().getId();
	};
	
	public String getOrdem(){
		return this.ordem;
	};

	public void setOrdem(String ordem){
        	this.ordem = ordem;
	};
	
	
	
	//novos
	
	
	
	
	
}