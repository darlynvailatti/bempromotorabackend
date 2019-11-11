
package br.com.bempromotora.backend.domain.parceiro;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Cidade")
@Data
public class CidadeEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idCidade_gen")
	@SequenceGenerator(name= "idCidade_gen", sequenceName="idCidade_seq", allocationSize =1)
	@Column(name = "idCidade", updatable = false, nullable = false)
	private Long idCidade;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "UF")
	private String uF;
	
	@Column(name = "Pais")
	private String pais;
	
	@Override
	public Long getId(){
		return getIdCidade();
	};
}