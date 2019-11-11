
package br.com.bempromotora.backend.domain.common;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "TipoArquivo")
@Data
public class TipoArquivoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoArquivo_gen")
	@SequenceGenerator(name= "idTipoArquivo_gen", sequenceName="idTipoArquivo_seq", allocationSize =1)
	@Column(name = "idTipoArquivo", updatable = false, nullable = false)
	private Long idTipoArquivo;
	
	@Column(name = "Descricao")
	private String descricao;

	@Override
	public Long getId(){
		return getIdTipoArquivo();
	};

}