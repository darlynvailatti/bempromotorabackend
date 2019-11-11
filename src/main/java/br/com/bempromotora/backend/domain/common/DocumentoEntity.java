
package br.com.bempromotora.backend.domain.common;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.Set;


@Entity
@Table(name = "Documento")
@Data
public class DocumentoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idDocumento_gen")
	@SequenceGenerator(name = "idDocumento_gen", sequenceName = "idDocumento_seq", allocationSize = 1)
	@Column(name = "idDocumento", updatable = false, nullable = false)
	private Long idDocumento;

	@Column(name = "OrgaoEmissor")
	private String orgaoEmissor;

	@Column(name = "Data")
	private LocalDate data;

	@Column(name = "CodigoDocumento")
	private String codigoDocumento;

	@Override
	public Long getId() {
		return getIdDocumento();
	}

	;
}