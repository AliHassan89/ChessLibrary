package exception;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class InvalidPieceExceptionTest {

  @Test
  public void shouldCreate() {
    // given
    String message = "message";
    Exception cause = new Exception();

    // when
    InvalidPieceException invalidPieceException = new InvalidPieceException(message, cause);

    // then
    assertThat(invalidPieceException, notNullValue());
    assertThat(invalidPieceException.getMessage(), equalTo(message));
    assertThat(invalidPieceException.getCause(), equalTo(cause));
  }

  @Test
  public void shouldCreateWithMessageOnly() {
    // given
    String message = "message";

    // when
    InvalidPieceException invalidPieceException = new InvalidPieceException(message);

    // then
    assertThat(invalidPieceException, notNullValue());
    assertThat(invalidPieceException.getMessage(), equalTo(message));
  }
}
