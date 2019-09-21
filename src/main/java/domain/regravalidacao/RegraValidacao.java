package domain.regravalidacao;

import architecture.AbstractEntity;

public class RegraValidacao extends AbstractEntity {

    private Long id;

    private String nome;

    private String valorComparacao;

    private OperadorRegraValidacaoEnum operador;

    private AtributoPropostaEntity atributo;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorComparacao() {
        return valorComparacao;
    }

    public void setValorComparacao(String valorComparacao) {
        this.valorComparacao = valorComparacao;
    }

    public OperadorRegraValidacaoEnum getOperador() {
        return operador;
    }

    public void setOperador(OperadorRegraValidacaoEnum operador) {
        this.operador = operador;
    }

    public AtributoPropostaEntity getAtributo() {
        return atributo;
    }

    public void setAtributo(AtributoPropostaEntity atributo) {
        this.atributo = atributo;
    }
}
