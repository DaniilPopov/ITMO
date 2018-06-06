package exceptions;

public class UnchekedException extends RuntimeException {

    public UnchekedException(String mess) {
        super(mess);
    }

    public UnchekedException(String mess, Throwable cause) {
        super(mess, cause);
    }

    public UnchekedException() {
        super();
    }
}
