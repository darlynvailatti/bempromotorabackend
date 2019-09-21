package architecture.util;

import architecture.BPLogicException;

import java.text.MessageFormat;

public class GaranteQue {


    public static void ehVerdade(boolean expressao, String mensagem, Object... objetcs) throws BPLogicException {
        if(!expressao) {
            String mensagemFormatada = MessageFormat.format(mensagem, objetcs);
            throw new BPLogicException(mensagemFormatada);
        }
    }

    public static void naoEhVerdade(boolean expressao, String mensagem, Object... objects) throws BPLogicException {
        ehVerdade(!expressao, mensagem, objects);
    }
}
