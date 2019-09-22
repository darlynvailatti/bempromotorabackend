
package domain;

import java.time.LocalDate;

import javax.persistence.*;

import domain.ConteudoEntity;
 

@Entity
@Table(name = "Data")
public class DataEntity extends architecture.AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idConteudo", referencedColumnName="idConteudo")
	
	private ConteudoEntity conteudo;
	@Column(name = "DataHora")
	private LocalDate dataHora;
	
	

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
	
	public LocalDate getDataHora(){
		return this.dataHora;
	};

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	};
	
	
	
	//novos
	
	
	
	
	
}