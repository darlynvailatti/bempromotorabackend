package architecture;

public class BPLogicException extends Exception {

    public BPLogicException() {
    }

    public BPLogicException(String message) {
        super(message);
    }

    public BPLogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public BPLogicException(Throwable cause) {
        super(cause);
    }

    public BPLogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
