package br.com.bempromotora.backend.domain.parceiro;

import br.com.bempromotora.backend.common.Periodo;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "UsuarioParceiroEntity")
@Data
public class UsuarioParceiroEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

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

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "inicio.conteudo", column = @Column(name = "DATA_INICIO")),
            @AttributeOverride(name = "fim.conteudo", column = @Column(name = "DATA_FIM"))
    })
    private Periodo vigencia;

    @Override
    public Long getId() {
        return id;
    }

}
