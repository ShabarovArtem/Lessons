package exceptions;

public class CarisBrokenException extends Exception{
    public CarisBrokenException() {
    }

    public CarisBrokenException(String message) {
        super(message);
    }

    public CarisBrokenException(String message, Throwable cause) {
        super(message, cause);
    }

    public CarisBrokenException(Throwable cause) {
        super(cause);
    }

    public CarisBrokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
