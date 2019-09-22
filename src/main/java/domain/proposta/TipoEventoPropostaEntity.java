package domain.proposta;

import javax.persistence.*;

import architecture.AbstractEntity;

import java.util.Set;

@Entity
@Table(name = "TipoEventoPropostaEntity")
public class TipoEventoPropostaEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idTipoEventoPropostaCredito_gen")
    @SequenceGenerator(name= "idTipoEventoPropostaCredito_gen", sequenceName="idTipoEventoPropostaCredito_seq", allocationSize =1)
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinTable(name="TipoEventoPropostaSituacaoValidaProposta",
            joinColumns={@JoinColumn(name = "idTipoEventoProposta")},
            inverseJoinColumns={@JoinColumn(name = "idTipoEventoPropostaSituacaoValida")})
    private Set<TipoEventoSituacaoValidaPropostaCredito> situacoesValidas;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<TipoEventoSituacaoValidaPropostaCredito> getSituacoesValidas() {
        return situacoesValidas;
    }

    public void setSituacoesValidas(Set<TipoEventoSituacaoValidaPropostaCredito> situacoesValidas) {
        this.situacoesValidas = situacoesValidas;
    }
}
