
package domain;


import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "TipoDocumento")
public class TipoDocumentoEntity extends domain.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoDocumento_gen")
	@SequenceGenerator(name= "idTipoDocumento_gen", sequenceName="idTipoDocumento_seq", allocationSize =1)
	@Column(name = "idTipoDocumento", updatable = false, nullable = false)
	private Long idTipoDocumento;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="tipoDocumento", cascade=CascadeType.ALL)
	private List<TipoArquivoEntity> tipoDocumentoTiposDeArquivo;
	
    	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="tipoDocumento", cascade=CascadeType.ALL)
	private List<DocumentoEntity> tipoDocumentoDocumento;
	
    	
	

	// gets e sets
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
	
	
	
	//novos
	
  	public List<TipoArquivoEntity> getTipoDocumentoTiposDeArquivo(){
		return this.tipoDocumentoTiposDeArquivo;
	};
	public void setTipoDocumentoTiposDeArquivo(List<TipoArquivoEntity> tipoDocumentoTiposDeArquivo ){
		this.tipoDocumentoTiposDeArquivo=tipoDocumentoTiposDeArquivo;
	}
	
    	
	
  	public List<DocumentoEntity> getTipoDocumentoDocumento(){
		return this.tipoDocumentoDocumento;
	};
	public void setTipoDocumentoDocumento(List<DocumentoEntity> tipoDocumentoDocumento ){
		this.tipoDocumentoDocumento=tipoDocumentoDocumento;
	}
	
    	
	
	
	
	
	
}