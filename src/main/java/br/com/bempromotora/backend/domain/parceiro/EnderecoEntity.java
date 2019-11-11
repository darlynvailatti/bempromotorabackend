package br.com.bempromotora.backend.domain.parceiro;

import br.com.bempromotora.backend.common.Periodo;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "EnderecoEntity")
@Data
public class EnderecoEntity extends br.com.bempromotora.backend.architecture.AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idDocumento_gen")
    @SequenceGenerator(name= "idDocumento_gen", sequenceName="idDocumento_seq", allocationSize =1)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idParceiro")
    private ParceiroEntity parceiro;

    private String logradouro;

    private String cep;

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
