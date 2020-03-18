package br.com.bempromotora.backend.service.processor;

import br.com.bempromotora.backend.architecture.logic.processor.pattern.AbstractProcessor;
import br.com.bempromotora.backend.architecture.util.EnsuresThat;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;
import br.com.bempromotora.backend.domain.proposta.regra.validador.IValidadorRegraProposta;
import br.com.bempromotora.backend.domain.proposta.regra.validador.ValidadorRegraCampoPropostaIdade;
import br.com.bempromotora.backend.service.dto.ValidaRegrasSobreProposta;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ProcessadorQueValidaRegrasSobreProposta
        extends AbstractProcessor<ValidaRegrasSobreProposta, ValidaRegrasSobreProposta.RetornoDTO> {

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
    protected ValidaRegrasSobreProposta.RetornoDTO executionReturn() throws Exception {
        return new ValidaRegrasSobreProposta.RetornoDTO(proposta, regras, resultadosDaValidacao);
    }

    @Override
    protected String getName() {
        return ProcessadorQueValidaRegrasSobreProposta.class.getSimpleName();
    }
}
