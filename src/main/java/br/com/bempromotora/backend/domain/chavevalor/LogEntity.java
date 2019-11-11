
package br.com.bempromotora.backend.domain.chavevalor;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "Log")
@Data
public class LogEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
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
	
	@Override
	public Long getId(){
		return getIdLog();
	};
}