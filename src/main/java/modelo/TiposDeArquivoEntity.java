
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.TiposDocumentoEntity;

import java.util.List;
 

@Entity
@Table(name = "TiposDeArquivo")
public class TiposDeArquivoEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoArquivo_gen")
	@SequenceGenerator(name= "idTipoArquivo_gen", sequenceName="idTipoArquivo_seq", allocationSize =1)
	@Column(name = "idTipoArquivo", updatable = false, nullable = false)
	private Long idTipoArquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTipoDocumento")
	private TiposDocumentoEntity tipoDocumento;
	@Column(name = "Descricao")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="poArquivo", cascade=CascadeType.ALL)
	private List<ArquivoEntity> poArquivoArquivo;
	
    	
	

	// gets e sets
	public Long getIdTipoArquivo(){
		return this.idTipoArquivo;
	};

    	public void setIdTipoArquivo(Long idTipoArquivo){
        	this.idTipoArquivo = idTipoArquivo;
	};
	
	@Override
	public Long getId(){
		return getIdTipoArquivo();
	};
	
	public TiposDocumentoEntity getTipoDocumento(){
		return this.tipoDocumento;
	};

    	public void setTipoDocumento(TiposDocumentoEntity tipoDocumento){
        	this.tipoDocumento = tipoDocumento;
	};
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};
	
	
	
	//novos
	
  	public List<ArquivoEntity> getPoArquivoArquivo(){
		return this.poArquivoArquivo;
	};
	public void setPoArquivoArquivo(List<ArquivoEntity> poArquivoArquivo ){
		this.poArquivoArquivo=poArquivoArquivo;
	}
	
    	
	
	
	
	
	
}