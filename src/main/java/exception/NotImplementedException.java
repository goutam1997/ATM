package exception;

public class NotImplementedException extends RuntimeException {
    public NotImplementedException() {
        System.out.println("Invalid Operation selected!!!");
    }
}
