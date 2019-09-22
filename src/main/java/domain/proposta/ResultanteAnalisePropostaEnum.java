package domain.proposta;

public enum ResultanteAnalisePropostaEnum {

    APROVADA("Aprovada"),
    REPROVADA("Reprovada");

    private String descricao;

    ResultanteAnalisePropostaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
