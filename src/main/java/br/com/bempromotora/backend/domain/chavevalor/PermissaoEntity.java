
package br.com.bempromotora.backend.domain.chavevalor;


import lombok.Data;

import javax.persistence.*;

import java.util.List;

 

@Entity
@Table(name = "Permissao")
@Data
public class PermissaoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="idPermissao_gen")
	@SequenceGenerator(name= "idPermissao_gen", sequenceName="idPermissao_seq", allocationSize =1)
	@Column(name = "idPermissao", updatable = false, nullable = false)
	private Long idPermissao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idUsuario")
	private ConteudoEntity usuario;

	@OneToMany(fetch = FetchType.LAZY, mappedBy="permissao", cascade=CascadeType.ALL)
	private List<LogEntity> permissaoLog;

	@ManyToOne(fetch = FetchType.LAZY)
	private CampoDeEntidadeEntity campo;

	@Override
	public Long getId(){
		return getIdPermissao();
	};

}