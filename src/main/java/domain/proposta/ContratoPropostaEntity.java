package domain.proposta;

import common.Data;
import domain.ArquivoEntity;

import javax.persistence.*;

import architecture.AbstractEntity;

@Entity
@Table(name = "ContratoPropostaEntity")
public class ContratoPropostaEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="idContratoProposta_gen")
    @SequenceGenerator(name= "idContratoProposta_gen", sequenceName="idContratoProposta_seq", allocationSize =1)
    @Column(name = "idContratoProposta", updatable = false, nullable = false)
    private Long id;

    private Data emissao;

    private Data validade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idArquivo")
    private ArquivoEntity arquivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idProposta")
    private PropostaEntity proposta;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Data getEmissao() {
        return emissao;
    }

    public void setEmissao(Data emissao) {
        this.emissao = emissao;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public ArquivoEntity getArquivo() {
        return arquivo;
    }

    public void setArquivo(ArquivoEntity arquivo) {
        this.arquivo = arquivo;
    }

    public PropostaEntity getProposta() {
        return proposta;
    }

    public void setProposta(PropostaEntity proposta) {
        this.proposta = proposta;
    }
}
