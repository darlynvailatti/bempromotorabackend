
package br.com.bempromotora.backend.domain.common;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "TipoDocumento")
@Data
public class TipoDocumentoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoDocumento_gen")
	@SequenceGenerator(name= "idTipoDocumento_gen", sequenceName="idTipoDocumento_seq", allocationSize =1)
	@Column(name = "idTipoDocumento", updatable = false, nullable = false)
	private Long idTipoDocumento;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Override
	public Long getId(){
		return getIdTipoDocumento();
	};

}