package exceptions;

public class ExistingUser extends RuntimeException {
    public ExistingUser(String message) {
        super(message);
    }
}