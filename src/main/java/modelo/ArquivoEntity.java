
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ContratoArquivoEntity;
import modelo.DocumentoArquivoEntity;
import modelo.PropostaArquivoEntity;
import modelo.TiposDeArquivoEntity;

import java.util.List;

 

@Entity
@Table(name = "Arquivo")
public class ArquivoEntity extends AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idArquivo_gen")
	@SequenceGenerator(name= "idArquivo_gen", sequenceName="idArquivo_seq", allocationSize =1)
	@Column(name = "idArquivo", updatable = false, nullable = false)
	private Long idArquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TipoArquivo")
	private TiposDeArquivoEntity poArquivo;
	@Column(name = "ImagemDeDocumento")
	private byte[] imagemDeDocumento;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="arquivo", cascade=CascadeType.ALL)
	private DocumentoArquivoEntity arquivoDocumentoArquivo;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="arquivo", cascade=CascadeType.ALL)
	private ContratoArquivoEntity arquivoContratoArquivo;
	
    	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="arquivo", cascade=CascadeType.ALL)
	private PropostaArquivoEntity arquivoPropostaArquivo;
	
    	
	

	// gets e sets
	public Long getIdArquivo(){
		return this.idArquivo;
	};

    	public void setIdArquivo(Long idArquivo){
        	this.idArquivo = idArquivo;
	};
	
	@Override
	public Long getId(){
		return getIdArquivo();
	};
	
	public TiposDeArquivoEntity getPoArquivo(){
		return this.poArquivo;
	};

    	public void setPoArquivo(TiposDeArquivoEntity poArquivo){
        	this.poArquivo = poArquivo;
	};
	
	public byte[] getImagemDeDocumento(){
		return this.imagemDeDocumento;
	};

	public void setImagemDeDocumento(byte[] imagemDeDocumento){
        	this.imagemDeDocumento = imagemDeDocumento;
	};
	
	
	
	//novos
	
  	public DocumentoArquivoEntity getArquivoDocumentoArquivo(){
		return this.arquivoDocumentoArquivo;
	};
	public void setArquivoDocumentoArquivo(DocumentoArquivoEntity arquivoDocumentoArquivo ){
		this.arquivoDocumentoArquivo=arquivoDocumentoArquivo;
	};

	
    	
	
  	public ContratoArquivoEntity getArquivoContratoArquivo(){
		return this.arquivoContratoArquivo;
	};
	public void setArquivoContratoArquivo(ContratoArquivoEntity arquivoContratoArquivo ){
		this.arquivoContratoArquivo=arquivoContratoArquivo;
	};

	
    	
	
  	public PropostaArquivoEntity getArquivoPropostaArquivo(){
		return this.arquivoPropostaArquivo;
	};
	public void setArquivoPropostaArquivo(PropostaArquivoEntity arquivoPropostaArquivo ){
		this.arquivoPropostaArquivo=arquivoPropostaArquivo;
	};

	
    	
	
	
	
	
	
}