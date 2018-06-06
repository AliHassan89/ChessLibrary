package exception;

public class WrongInputFileException extends RuntimeException  {

    public WrongInputFileException() {
      super();
    }
    public WrongInputFileException(String s) {
      super(s);
    }
    public WrongInputFileException(String s, Throwable throwable) {
      super(s, throwable);
    }
    public WrongInputFileException(Throwable throwable) {
      super(throwable);
    }

}