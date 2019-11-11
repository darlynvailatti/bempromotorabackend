package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.common.Data;

import javax.persistence.*;

import br.com.bempromotora.backend.architecture.AbstractEntity;

@Entity
@Table(name = "EventoPropostaCreditoEntity")
@lombok.Data
public class EventoPropostaCreditoEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idEventoPropostaCredito_gen")
    @SequenceGenerator(name= "idEventoPropostaCredito_gen", sequenceName="idEventoPropostaCredito_seq", allocationSize =1)
    private Long id;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "conteudo", column = @Column(name = "DATA"))
    })
    private Data quando;

    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idProposta")
    private PropostaEntity proposta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idTipoEventoProposta")
    private TipoEventoPropostaEntity tipo;

}
