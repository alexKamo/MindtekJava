package homeworks.exceptionRuntimeHM;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String message) {
        super(message);
    }
}
