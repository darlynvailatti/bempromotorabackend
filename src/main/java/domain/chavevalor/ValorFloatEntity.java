
package domain.chavevalor;

import java.math.BigDecimal;
import javax.persistence.*;


@Entity
@Table(name = "ValorFloat")
public class ValorFloatEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "ValorFloat")
	private BigDecimal valorFloat;
	
	

	// gets e sets
	@Override
	public Long getId(){
		return getConteudo().getId();
	};
	
	
	public ConteudoEntity getConteudo(){
		return this.conteudo;
	};

    	public void setConteudo(ConteudoEntity conteudo){
        	this.conteudo = conteudo;
	};
	
	public BigDecimal getValorFloat(){
		return this.valorFloat;
	};

	public void setValorFloat(BigDecimal valorFloat){
        	this.valorFloat = valorFloat;
	};
	
	
	
	//novos
	
	
	
	
	
}