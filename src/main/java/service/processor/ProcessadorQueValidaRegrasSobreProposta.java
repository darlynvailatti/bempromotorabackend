package service.processor;

import architecture.logic.processor.pattern.AbstractProcessor;
import architecture.util.EnsuresThat;
import domain.proposta.PropostaEntity;
import domain.proposta.regra.RegraEntity;
import domain.proposta.regra.validador.IValidadorRegraProposta;
import domain.proposta.regra.validador.ValidadorRegraCampoPropostaIdade;
import service.dto.ValidaRegrasSobrePropostaDTO;

import java.util.*;

public class ProcessadorQueValidaRegrasSobreProposta
        extends AbstractProcessor<ValidaRegrasSobrePropostaDTO, ValidaRegrasSobrePropostaDTO.RetornoDTO> {

    private ValidadorRegraCampoPropostaIdade validadorRegraCampoIdade;

    private Collection<IValidadorRegraProposta> validadores;

    private PropostaEntity proposta;

    private Collection<RegraEntity> regras;

    private List<String> resultadosDaValidacao;

    @Override
    protected void validateInput() throws Exception {
        EnsuresThat.isNotNull(input, "Entrada não pode ser NULA");
        EnsuresThat.isNotNull(input.getProposta(), "Proposta não pode ser NULA");
        EnsuresThat.isNotNull(input.getRegras(), "Não pode validar regras enexistentes");
    }

    @Override
    protected void executionImplementation() throws Exception {
        guardarLocalmente();
        inicializarValidadores();
        for (RegraEntity regra : regras) {
            excutarValidaores(regra);
        }
    }

    private void excutarValidaores(RegraEntity regra) throws Exception {
        try {
            for (IValidadorRegraProposta validador : validadores) {
                if(validador.aceitaValidar(regra)){
                    validador.validar(regra, proposta);
                }
            }
        }catch(Exception e){
            StringBuilder mensagemResultado = new StringBuilder();
            mensagemResultado.append("Regra ")
                    .append(regra.getDescricao())
                    .append(" falhou na validação: ")
                    .append(e.getMessage());
            resultadosDaValidacao.add(mensagemResultado.toString());
        }
    }

    private void guardarLocalmente() {
        proposta = input.getProposta();
        regras = input.getRegras();
    }

    private void inicializarValidadores() {
        validadores = Arrays.asList(validadorRegraCampoIdade);
        resultadosDaValidacao = new ArrayList<>();
    }

    @Override
    protected ValidaRegrasSobrePropostaDTO.RetornoDTO executionReturn() throws Exception {
        return new ValidaRegrasSobrePropostaDTO.RetornoDTO(proposta, regras, resultadosDaValidacao);
    }

    @Override
    protected String getName() {
        return ProcessadorQueValidaRegrasSobreProposta.class.getSimpleName();
    }
}