package piece;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;
import org.meanbean.test.BeanTester;

public class PieceTest {

  @Test
  public void shouldVerifyHashcodeEqualsContract() {
    EqualsVerifier.forClass(Piece.class)
        .suppress(Warning.NONFINAL_FIELDS).verify();
  }

  @Test
  public void shouldTestBean() {
    new BeanTester().testBean(Piece.class);
  }

  @Test
  public void shouldTestOverloadedConstructor(){
    //when
    Piece piece = new Piece(PieceType.King, PieceColor.White);

    //then
    assertThat(piece.getPieceType(), equalTo(PieceType.King));
    assertThat(piece.getPieceColor(), equalTo(PieceColor.White));
  }

}
