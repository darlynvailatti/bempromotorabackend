package service.processor;

import architecture.logic.processor.pattern.AbstractProcessor;
import architecture.util.EnsuresThat;
import domain.proposta.PropostaEntity;
import domain.proposta.SituacaoPropostaCreditoEnum;
import service.dto.TrocaSituacaoDaPropostaDTO;

import java.util.Arrays;
import java.util.List;

import static domain.proposta.SituacaoPropostaCreditoEnum.*;

public class ProcessadorQueAlteraSituacaoDaProposta
        extends AbstractProcessor<TrocaSituacaoDaPropostaDTO, TrocaSituacaoDaPropostaDTO.Retorno> {

    private SituacaoPropostaCreditoEnum novaSituacao;
    private SituacaoPropostaCreditoEnum atualSituacao;
    private PropostaEntity proposta;

    @Override
    protected void validateInput() throws Exception {
        EnsuresThat.isNotNull(input, "{0} náo pode ser NULO", TrocaSituacaoDaPropostaDTO.class.getSimpleName());
        EnsuresThat.isNotNull(input.getNovaSituacao(), "Nova situação não foi definida");
        EnsuresThat.isNotNull(input.getProposta(), "Proposta não foi definida");
        EnsuresThat.isNotNull(input.getProposta().getSituacao(), "Proposta {0} não possui situação definida");
    }

    @Override
    protected void executionImplementation() throws Exception {
        novaSituacao = input.getNovaSituacao();
        atualSituacao = input.getProposta().getSituacao();
        proposta = input.getProposta();
        GerenciadorDeSituacaoDaProposta.garanteQuePodeMudarSituacaoDePara(atualSituacao, novaSituacao);
        proposta.setSituacao(novaSituacao);
    }


    @Override
    protected TrocaSituacaoDaPropostaDTO.Retorno executionReturn() throws Exception {
        return new TrocaSituacaoDaPropostaDTO.Retorno(proposta);
    }

    @Override
    protected String getName() {
        return ProcessadorQueAlteraSituacaoDaProposta.class.getSimpleName();
    }

    private static class GerenciadorDeSituacaoDaProposta {


        public static void garanteQuePodeMudarSituacaoDePara(SituacaoPropostaCreditoEnum atual, SituacaoPropostaCreditoEnum nova) throws Exception {

            Boolean ehUmaSituacaoValida = Boolean.FALSE;
            switch (atual) {
                case EM_EDICAO:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoEmEdicao().contains(nova);
                    break;
                case ABERTA:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoAberta().contains(nova);
                    break;
                case PENDENTE_DE_ANALISE:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoPendenteDeAnalise().contains(nova);
                    break;
                case SUBMETIDA_PARA_ANALISE:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoSubmetidaParaAnalise().contains(nova);
                    break;
                case APROVADA:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoAprovada().contains(nova);
                    break;
                case ANALISE_NO_CONVENIO:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoAnaliseNoConvenio().contains(nova);
                    break;
                case PROCESSANDO_PAGAMENTO:
                    ehUmaSituacaoValida = novasSituacoesValidasQuandoProcessandoPagamento().contains(nova);
                    break;
                case REPROVADA:
                    break;
                case CANCELADA:
                    break;
                case REPROVADA_NO_CONVENIO:
                    break;
                default:
                    break;
            }
            EnsuresThat.isTrue(ehUmaSituacaoValida, "Não pode mudar a situação de {0} para {1}", atual, nova);
        }


        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoEmEdicao(){
            return Arrays.asList(ABERTA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoAberta(){
            return Arrays.asList(EM_EDICAO, PENDENTE_DE_ANALISE, SUBMETIDA_PARA_ANALISE, CANCELADA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoAprovada(){
            return Arrays.asList(ANALISE_NO_CONVENIO, CANCELADA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoPendenteDeAnalise(){
            return Arrays.asList(ABERTA, SUBMETIDA_PARA_ANALISE, CANCELADA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoSubmetidaParaAnalise(){
            return Arrays.asList(ABERTA, APROVADA, REPROVADA, CANCELADA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoAnaliseNoConvenio(){
            return Arrays.asList(REPROVADA_NO_CONVENIO, PROCESSANDO_PAGAMENTO, CANCELADA);
        }

        private static List<SituacaoPropostaCreditoEnum> novasSituacoesValidasQuandoProcessandoPagamento(){
            return Arrays.asList(PAGAMENTO_EFETUADO);
        }
    }

}