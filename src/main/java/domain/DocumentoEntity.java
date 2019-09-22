
package domain;

import java.time.LocalDate;

import javax.persistence.*;

import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Documento")
public class DocumentoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idDocumento_gen")
	@SequenceGenerator(name= "idDocumento_gen", sequenceName="idDocumento_seq", allocationSize =1)
	@Column(name = "idDocumento", updatable = false, nullable = false)
	private Long idDocumento;
	
	@Column(name = "OrgaoEmissor")
	private String orgaoEmissor;
	
	@Column(name = "Data")
	private LocalDate data;
	
	@Column(name = "CodigoDocumento")
	private String codigoDocumento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="documento", cascade=CascadeType.ALL)
	private Set<DocumentoArquivoEntity> arquivos;
	
    	
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
	
  	public Set<DocumentoArquivoEntity> getArquivos(){
		return this.arquivos;
	};

  	public void setArquivos(Set<DocumentoArquivoEntity> arquivos){
		this.arquivos = arquivos;
	}

}