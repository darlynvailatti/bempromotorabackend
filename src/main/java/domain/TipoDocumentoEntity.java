
package domain;


import javax.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "TipoDocumento")
public class TipoDocumentoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoDocumento_gen")
	@SequenceGenerator(name= "idTipoDocumento_gen", sequenceName="idTipoDocumento_seq", allocationSize =1)
	@Column(name = "idTipoDocumento", updatable = false, nullable = false)
	private Long idTipoDocumento;
	
	@Column(name = "Descricao")
	private String descricao;
	
	public Long getIdTipoDocumento(){
		return this.idTipoDocumento;
	};

	public void setIdTipoDocumento(Long idTipoDocumento){
        	this.idTipoDocumento = idTipoDocumento;
	};
	
	@Override
	public Long getId(){
		return getIdTipoDocumento();
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	

}