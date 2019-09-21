
package domain;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Documento")
public class DocumentoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idDocumento_gen")
	@SequenceGenerator(name= "idDocumento_gen", sequenceName="idDocumento_seq", allocationSize =1)
	@Column(name = "idDocumento", updatable = false, nullable = false)
	private Long idDocumento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idParceiro")
	private ParceiroEntity parceiro;

	@Column(name = "OrgaoEmissor")
	private String orgaoEmissor;
	
	@Column(name = "Data")
	private LocalDate data;
	
	@Column(name = "CodigoDocumento")
	private String codigoDocumento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="documento", cascade=CascadeType.ALL)
	private List<DocumentoArquivoEntity> documentoDocumentoArquivo;
	
    	
	

	// gets e sets
	public Long getIdDocumento(){
		return this.idDocumento;
	};

    	public void setIdDocumento(Long idDocumento){
        	this.idDocumento = idDocumento;
	};
	
	@Override
	public Long getId(){
		return getIdDocumento();
	};
	
	public ParceiroEntity getParceiro(){
		return this.parceiro;
	};

    	public void setParceiro(ParceiroEntity parceiro){
        	this.parceiro = parceiro;
	};
	
	public String getOrgaoEmissor(){
		return this.orgaoEmissor;
	};

	public void setOrgaoEmissor(String orgaoEmissor){
        	this.orgaoEmissor = orgaoEmissor;
	};
	
	public LocalDate getData(){
		return this.data;
	};

	public void setData(LocalDate data){
        	this.data = data;
	};
	
	public String getCodigoDocumento(){
		return this.codigoDocumento;
	};

	public void setCodigoDocumento(String codigoDocumento){
        	this.codigoDocumento = codigoDocumento;
	};
	
	
	
	//novos
	
  	public List<DocumentoArquivoEntity> getDocumentoDocumentoArquivo(){
		return this.documentoDocumentoArquivo;
	};
	public void setDocumentoDocumentoArquivo(List<DocumentoArquivoEntity> documentoDocumentoArquivo ){
		this.documentoDocumentoArquivo=documentoDocumentoArquivo;
	}
	
    	
	
	
	
	
	
}