package br.com.bempromotora.backend.domain.proposta.regra.validador;

import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.regra.RegraEntity;

public interface IValidadorRegraProposta {

    boolean aceitaValidar(RegraEntity regra);

    void validar(RegraEntity regra, PropostaEntity proposta) throws Exception;

}
