package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.common.Data;
import br.com.bempromotora.backend.domain.common.UsuarioEntity;

import javax.persistence.*;

import br.com.bempromotora.backend.architecture.AbstractEntity;

@Entity
@Table(name = "AnalisePropostaCreditoEntity")
@lombok.Data
public class AnalisePropostaCreditoEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idAnalisePropostaCredito_gen")
    @SequenceGenerator(name= "idAnalisePropostaCredito_gen", sequenceName="idAnalisePropostaCredito_seq", allocationSize =1)
    @Column(name = "idAnalisePropostaCredito", updatable = false, nullable = false)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private ResultanteAnalisePropostaEnum resultante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idProposta")
    private PropostaEntity proposta;

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "conteudo", column = @Column(name = "DATA"))
    })
    private Data quando;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idAnalista")
    private UsuarioEntity analista;

}
