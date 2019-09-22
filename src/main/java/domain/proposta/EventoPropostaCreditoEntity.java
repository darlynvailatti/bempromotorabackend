package domain.proposta;

import common.Data;

import javax.persistence.*;

import architecture.AbstractEntity;

@Entity
@Table(name = "EventoPropostaCreditoEntity")
public class EventoPropostaCreditoEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idEventoPropostaCredito_gen")
    @SequenceGenerator(name= "idEventoPropostaCredito_gen", sequenceName="idEventoPropostaCredito_seq", allocationSize =1)
    private Long id;

    private Data quando;

    private String descricao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idProposta")
    private PropostaEntity proposta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idTipoEventoProposta")
    private TipoEventoPropostaEntity tipo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getQuando() {
        return quando;
    }

    public void setQuando(Data quando) {
        this.quando = quando;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PropostaEntity getProposta() {
        return proposta;
    }

    public void setProposta(PropostaEntity proposta) {
        this.proposta = proposta;
    }

    public TipoEventoPropostaEntity getTipo() {
        return tipo;
    }

    public void setTipo(TipoEventoPropostaEntity tipo) {
        this.tipo = tipo;
    }
}
