
package domain;


import javax.persistence.*;

import domain.ConteudoEntity;
import domain.LogEntity;
import java.util.List;

 

@Entity
@Table(name = "Permissao")
public class PermissaoEntity extends architecture.AbstractEntity
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
	
    	
	

	// gets e sets
	public Long getIdPermissao(){
		return this.idPermissao;
	};

    	public void setIdPermissao(Long idPermissao){
        	this.idPermissao = idPermissao;
	};
	
	@Override
	public Long getId(){
		return getIdPermissao();
	};
	
	public ConteudoEntity getUsuario(){
		return this.usuario;
	};

    	public void setUsuario(ConteudoEntity usuario){
        	this.usuario = usuario;
	};
	
	
	
	//novos
	
  	public List<LogEntity> getPermissaoLog(){
		return this.permissaoLog;
	};
	public void setPermissaoLog(List<LogEntity> permissaoLog ){
		this.permissaoLog=permissaoLog;
	}
	
    	
	
	
	
	
	
}