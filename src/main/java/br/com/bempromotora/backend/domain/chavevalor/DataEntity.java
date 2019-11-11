
package br.com.bempromotora.backend.domain.chavevalor;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name = "Data")
@Data
public class DataEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idData_gen")
	@SequenceGenerator(name= "idData_gen", sequenceName="idData_seq", allocationSize =1)
	@Column(name = "idData", updatable = false, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	private ConteudoEntity conteudo;

	@Column(name = "DataHora")
	private LocalDate dataHora;

	@Override
	public Long getId(){
		return this.id;
	};
}