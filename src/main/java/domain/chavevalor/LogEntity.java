
package domain.chavevalor;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "Log")
public class LogEntity extends architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idLog_gen")
	@SequenceGenerator(name= "idLog_gen", sequenceName="idLog_seq", allocationSize =1)
	@Column(name = "idLog", updatable = false, nullable = false)
	private Long idLog;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idPermissao")
	private PermissaoEntity permissao;
	@Column(name = "DataHora")
	private LocalDate dataHora;
	
	@Column(name = "CodigoDaTransacao")
	private String codigoDaTransacao;
	
	

	// gets e sets
	public Long getIdLog(){
		return this.idLog;
	};

    	public void setIdLog(Long idLog){
        	this.idLog = idLog;
	};
	
	@Override
	public Long getId(){
		return getIdLog();
	};
	
	public PermissaoEntity getPermissao(){
		return this.permissao;
	};

    	public void setPermissao(PermissaoEntity permissao){
        	this.permissao = permissao;
	};
	
	public LocalDate getDataHora(){
		return this.dataHora;
	};

	public void setDataHora(LocalDate dataHora){
        	this.dataHora = dataHora;
	};
	
	public String getCodigoDaTransacao(){
		return this.codigoDaTransacao;
	};

	public void setCodigoDaTransacao(String codigoDaTransacao){
        	this.codigoDaTransacao = codigoDaTransacao;
	};
	
	
	
	//novos
	
	
	
	
	
}