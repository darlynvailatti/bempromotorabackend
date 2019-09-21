package domain.propostacredito;

import architecture.AbstractEntity;

public class TipoEventoSituacaoValidaPropostaCredito extends AbstractEntity {

    private Long id;

    private SituacaoPropostaCreditoEnum situacao;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SituacaoPropostaCreditoEnum getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoPropostaCreditoEnum situacao) {
        this.situacao = situacao;
    }
}
