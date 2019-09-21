
package domain;


import javax.persistence.*;

import java.util.List;
 

@Entity
@Table(name = "TipoArquivo")
public class TipoArquivoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idTipoArquivo_gen")
	@SequenceGenerator(name= "idTipoArquivo_gen", sequenceName="idTipoArquivo_seq", allocationSize =1)
	@Column(name = "idTipoArquivo", updatable = false, nullable = false)
	private Long idTipoArquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idTipoDocumento")
	private TipoDocumentoEntity tipoDocumento;
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
	
	public TipoDocumentoEntity getTipoDocumento(){
		return this.tipoDocumento;
	};

    	public void setTipoDocumento(TipoDocumentoEntity tipoDocumento){
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