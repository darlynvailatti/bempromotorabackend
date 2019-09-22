
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
	
	@Column(name = "Descricao")
	private String descricao;

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
	
	public String getDescricao(){
		return this.descricao;
	};

	public void setDescricao(String descricao){
        	this.descricao = descricao;
	};

}