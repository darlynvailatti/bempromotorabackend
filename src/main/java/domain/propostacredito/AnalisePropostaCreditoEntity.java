package domain.propostacredito;

import common.Data;
import domain.AbstractEntity;
import domain.PropostaEntity;
import domain.ResultanteAnalisePropostaEnum;
import domain.UsuarioEntity;

import javax.persistence.*;

@Entity
@Table(name = "AnalisePropostaCreditoEntity")
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

    private Data quando;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idAnalista")
    private UsuarioEntity analista;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResultanteAnalisePropostaEnum getResultante() {
        return resultante;
    }

    public void setResultante(ResultanteAnalisePropostaEnum resultante) {
        this.resultante = resultante;
    }

    public PropostaEntity getProposta() {
        return proposta;
    }

    public void setProposta(PropostaEntity proposta) {
        this.proposta = proposta;
    }

    public Data getQuando() {
        return quando;
    }

    public void setQuando(Data quando) {
        this.quando = quando;
    }

    public UsuarioEntity getAnalista() {
        return analista;
    }

    public void setAnalista(UsuarioEntity analista) {
        this.analista = analista;
    }
}
