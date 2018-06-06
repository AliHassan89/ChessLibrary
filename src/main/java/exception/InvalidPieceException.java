package exception;

public class InvalidPieceException extends RuntimeException {

  public InvalidPieceException() {
    super();
  }
  public InvalidPieceException(String s) {
    super(s);
  }
  public InvalidPieceException(String s, Throwable cause) {
    super(s, cause);
  }

}
