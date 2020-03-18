package test;

import br.com.bempromotora.backend.BemPromotoraBackendApplication;
import br.com.bempromotora.backend.architecture.exception.BusinessLogicException;
import br.com.bempromotora.backend.domain.proposta.PropostaEntity;
import br.com.bempromotora.backend.domain.proposta.SituacaoPropostaEnum;
import br.com.bempromotora.backend.service.dto.TrocaSituacaoDaProposta;
import br.com.bempromotora.backend.service.processor.ProcessadorQueTrocaSituacaoDaProposta;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BemPromotoraBackendApplication.class})
@Slf4j
public class TesteExceptionHandlerAOP {

    @Autowired
    private ProcessadorQueTrocaSituacaoDaProposta processadorQueTrocaSituacaoDaProposta;

    @Test
    public void erroAoTrocarSituacaoDaProposta() throws BusinessLogicException, InterruptedException {

        Integer tentativas = 10;

        while(tentativas > 0) {
            log.info("Simulando tentativa {}", tentativas);
            try {
                PropostaEntity propostaEntity = new PropostaEntity();
                propostaEntity.setSituacao(SituacaoPropostaEnum.PAGAMENTO_EFETUADO);
                TrocaSituacaoDaProposta trocaSituacaoDTO = TrocaSituacaoDaProposta.builder()
                        .novaSituacao(SituacaoPropostaEnum.CANCELADA)
                        .proposta(propostaEntity)
                        .build();
                processadorQueTrocaSituacaoDaProposta.execute(trocaSituacaoDTO);

            }catch (BusinessLogicException e){
                log.error("Erro na tentativa {}: {}", tentativas, e.getMessage());
                Thread.sleep(10000l);
            }
            tentativas--;
        }
    }
}
