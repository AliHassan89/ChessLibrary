package exception;

public class InvalidPieceException extends RuntimeException {

  public InvalidPieceException() {
    super();
  }
  public InvalidPieceException(String s) {
    super(s);
  }

}
