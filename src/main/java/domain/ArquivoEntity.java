
package domain;

import javax.persistence.*;

@Entity
@Table(name = "Arquivo")
public class ArquivoEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idArquivo_gen")
	@SequenceGenerator(name= "idArquivo_gen", sequenceName="idArquivo_seq", allocationSize =1)
	@Column(name = "idArquivo", updatable = false, nullable = false)
	private Long idArquivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TipoArquivo")
	private TipoArquivoEntity poArquivo;

	@Column(name = "ImagemDeDocumento")
	private byte[] conteudo;

	private String extensao;
	
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
	
	public TipoArquivoEntity getPoArquivo(){
		return this.poArquivo;
	};

	public void setPoArquivo(TipoArquivoEntity poArquivo){
        	this.poArquivo = poArquivo;
	};
	
	public byte[] getConteudo(){
		return this.conteudo;
	};

	public void setConteudo(byte[] conteudo){
        	this.conteudo = conteudo;
	};

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}
}