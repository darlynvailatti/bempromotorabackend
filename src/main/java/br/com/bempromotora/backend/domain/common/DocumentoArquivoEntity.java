
package br.com.bempromotora.backend.domain.common;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "DocumentoArquivo")
@Data
public class DocumentoArquivoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idDocumentoArquivo_gen")
	@SequenceGenerator(name= "idDocumentoArquivo_gen", sequenceName="idDocumentoArquivo_seq", allocationSize =1)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private ArquivoEntity arquivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idDocumento")
	private DocumentoEntity documento;
	
	public ArquivoEntity getArquivo(){
		return this.arquivo;
	};

	@Override
	public Long getId() {
		return this.id;
	}

}