package domain.parceiro;

import common.Periodo;
import domain.UsuarioEntity;
import domain.parceiro.ParceiroEntity;

import javax.persistence.*;

@Entity
@Table(name = "VersaoContrato")
public class UsuarioParceiroEntity extends architecture.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idUsuarioParceiro_gen")
    @SequenceGenerator(name= "idUsuarioParceiro_gen", sequenceName="idUsuarioParceiro_seq", allocationSize =1)
    @Column(name = "idParceiroContrato", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idUsuario")
    private UsuarioEntity usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idParceiro")
    private ParceiroEntity parceiro;

    private Periodo vigencia;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public ParceiroEntity getParceiro() {
        return parceiro;
    }

    public void setParceiro(ParceiroEntity parceiro) {
        this.parceiro = parceiro;
    }

    public Periodo getVigencia() {
        return vigencia;
    }

    public void setVigencia(Periodo vigencia) {
        this.vigencia = vigencia;
    }
}
