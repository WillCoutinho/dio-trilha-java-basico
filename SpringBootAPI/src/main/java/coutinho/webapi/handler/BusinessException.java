package coutinho.webapi.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagemErro, Object... params) {
        super(String.format(mensagemErro, params));
    }
}
