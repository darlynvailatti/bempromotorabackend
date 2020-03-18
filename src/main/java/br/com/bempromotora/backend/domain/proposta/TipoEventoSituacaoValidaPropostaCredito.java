package br.com.bempromotora.backend.domain.proposta;

import br.com.bempromotora.backend.architecture.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "TipoEventoSituacaoValidaPropostaCredito")
public class TipoEventoSituacaoValidaPropostaCredito extends AbstractEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProposta_gen")
    @SequenceGenerator(name = "idProposta_gen", sequenceName = "idProposta_seq", allocationSize = 1)
    @Column(name = "idProposta", updatable = false, nullable = false)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private SituacaoPropostaEnum situacao;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SituacaoPropostaEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPropostaEnum situacao) {
        this.situacao = situacao;
    }
}
