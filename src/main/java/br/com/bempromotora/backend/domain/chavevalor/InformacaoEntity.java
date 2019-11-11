
package br.com.bempromotora.backend.domain.chavevalor;


import javax.persistence.*;

import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import lombok.Data;

import java.util.List;

 

@Entity
@Table(name = "Informacao")
@Data
public class InformacaoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idInformacao_gen")
	@SequenceGenerator(name= "idInformacao_gen", sequenceName="idInformacao_seq", allocationSize =1)
	@Column(name = "idInformacao", updatable = false, nullable = false)
	private Long idInformacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idEstrutura")
	private EstruturaDeRegistroEntity estrutura;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idRegistroDeInformacao")
	private RegistroEntity registroDeInformacao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idConteudo")
	private ConteudoEntity conteudo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="informacaoComparacao", cascade=CascadeType.ALL)
	private List<RegraEntity> informacaoComparacaoRegra;

	@Override
	public Long getId(){
		return getIdInformacao();
	};

}