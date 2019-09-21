
package modelo;


import javax.persistence.*;
import modelo.AbstractEntity;
import modelo.ArquivoEntity;
import modelo.DocumentoEntity;

import java.util.List;
 

@Entity
@Table(name = "DocumentoArquivo")
public class DocumentoArquivoEntity extends AbstractEntity
{
	
	@Id
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="idArquivo", referencedColumnName="idArquivo")
	
	private ArquivoEntity arquivo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idDocumento")
	private DocumentoEntity documento;
	

	// gets e sets
	public ArquivoEntity getArquivo(){
		return this.arquivo;
	};

    	public void setArquivo(ArquivoEntity arquivo){
        	this.arquivo = arquivo;
	};
	@Override
	public Long getId(){
		return getArquivo().getId();
	};
	
	public DocumentoEntity getDocumento(){
		return this.documento;
	};

    	public void setDocumento(DocumentoEntity documento){
        	this.documento = documento;
	};
	
	
	
	//novos
	
	
	
	
	
}