
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Registro")
@Data
public class RegistroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="registroDeInformacao_gen")
	@SequenceGenerator(name= "registroDeInformacao_gen", sequenceName="registroDeInformacao_seq", allocationSize =1)
	@Column(name = "RegistroDeInformacao", updatable = false, nullable = false)
	private Long registroDeInformacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="IdEntidade")
	private EntidadeEntity entidade;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="registroDeInformacao", cascade=CascadeType.ALL)
	private List<InformacaoEntity> registroDeInformacaoInformacao;

	@Override
	public Long getId(){
		return getRegistroDeInformacao();
	};

}