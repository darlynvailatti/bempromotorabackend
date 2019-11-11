
package br.com.bempromotora.backend.domain.common;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Arquivo")
@Data
public class ArquivoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idArquivo_gen")
	@SequenceGenerator(name= "idArquivo_gen", sequenceName="idArquivo_seq", allocationSize =1)
	@Column(name = "idArquivo", updatable = false, nullable = false)
	private Long idArquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TipoArquivo")
	private TipoArquivoEntity poArquivo;

	@Column(name = "ImagemDeDocumento")
	private byte[] conteudo;

	private String extensao;

	@Override
	public Long getId(){
		return getIdArquivo();
	};
	
}