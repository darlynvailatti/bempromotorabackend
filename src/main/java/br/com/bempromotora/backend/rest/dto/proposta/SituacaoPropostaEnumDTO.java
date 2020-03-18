package br.com.bempromotora.backend.rest.dto.proposta;



public enum SituacaoPropostaEnumDTO {

    EM_EDICAO(0, "Em edição"),
    ABERTA(10, "Aberta"),
    SUBMETIDA_PARA_ANALISE(20, "Submetida para análise"),
    PENDENTE_DE_ANALISE(30, "Pendente de Análise - Documentos"),
    AGUARDANDO_ASSINATURA(31, "Aguardando Assinatura"),
    ASSINADA(32, "Assinada"),
    EM_ANALISE(35, "Em análise"),
    APROVADA(40, "Aprovada"),
    REPROVADA(21, "Reprovada"),
    CANCELADA(101, "Cancelada"),
    ANALISE_NO_CONVENIO(50, "No Convenio"),
    REPROVADA_NO_CONVENIO(51, "Reprovada pelo Convenio"),
    PROCESSANDO_PAGAMENTO(60, "Aprovada Convenio - Processando Pagamento"),
    PAGAMENTO_EFETUADO(100, "Pagamento Efetuado"),
    QUITADA(150, "Quitada");

    private Integer codigo;
    private String descricao;

    SituacaoPropostaEnumDTO(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
