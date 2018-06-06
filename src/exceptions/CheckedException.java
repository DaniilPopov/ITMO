package exceptions;

public class CheckedException extends Exception {

    public CheckedException(String mess) {
        super(mess);
    }

    public CheckedException(String mess, Throwable cause) {
        super(mess, cause);
    }
}
