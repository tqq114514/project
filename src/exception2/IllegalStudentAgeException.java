package exception2;

public class IllegalStudentAgeException extends Exception{
    public IllegalStudentAgeException() {
    }

    public IllegalStudentAgeException(String message) {
        super(message);
    }

    public IllegalStudentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalStudentAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalStudentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
