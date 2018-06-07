package piece;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import exception.InvalidPieceException;
import org.junit.Test;
import org.meanbean.test.BeanTester;

public class PieceCounterTest {

  private static final PieceCounter pieceCounter = new PieceCounter();

  @Test
  public void shouldCreateFullBoardAndExpectItToBeValid(){
    //given
    pieceCounter.initCounters();

    Piece whitePawn_1 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_2 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_3 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_4 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_5 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_6 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_7 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whitePawn_8 = new Piece(PieceType.Pawn, PieceColor.White);
    Piece whiteRook_1 = new Piece(PieceType.Rook, PieceColor.White);
    Piece whiteRook_2 = new Piece(PieceType.Rook, PieceColor.White);
    Piece whiteBishop_1 = new Piece(PieceType.Bishop, PieceColor.White);
    Piece whiteBishop_2 = new Piece(PieceType.Bishop, PieceColor.White);
    Piece whiteKnight_1 = new Piece(PieceType.Knight, PieceColor.White);
    Piece whiteKnight_2 = new Piece(PieceType.Knight, PieceColor.White);
    Piece whiteQueen = new Piece(PieceType.Queen, PieceColor.White);
    Piece whiteKing = new Piece(PieceType.King, PieceColor.White);

    Piece blackPawn_1 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_2 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_3 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_4 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_5 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_6 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_7 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackPawn_8 = new Piece(PieceType.Pawn, PieceColor.Black);
    Piece blackRook_1 = new Piece(PieceType.Rook, PieceColor.Black);
    Piece blackRook_2 = new Piece(PieceType.Rook, PieceColor.Black);
    Piece blackBishop_1 = new Piece(PieceType.Bishop, PieceColor.Black);
    Piece blackBishop_2 = new Piece(PieceType.Bishop, PieceColor.Black);
    Piece blackKnight_1 = new Piece(PieceType.Knight, PieceColor.Black);
    Piece blackKnight_2 = new Piece(PieceType.Knight, PieceColor.Black);
    Piece blackQueen = new Piece(PieceType.Queen, PieceColor.Black);
    Piece blackKing = new Piece(PieceType.King, PieceColor.Black);

    //then
    //check validity of all white pieces
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_3), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_4), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_5), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_6), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_7), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whitePawn_8), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteRook_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteRook_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteBishop_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteBishop_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteKnight_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteKnight_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteQueen), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(whiteKing), equalTo(true));

    //check validity of all black pieces
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_3), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_4), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_5), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_6), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_7), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackPawn_8), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackRook_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackRook_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackBishop_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackBishop_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackKnight_1), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackKnight_2), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackQueen), equalTo(true));
    assertThat(pieceCounter.isPieceValidToAdd(blackKing), equalTo(true));
  }

  @Test(expected = InvalidPieceException.class)
  public void shouldThrowInvalidPieceExceptionOnAddingExtraPiece(){
    //given
    pieceCounter.initCounters();

    Piece whiteRook_1 = new Piece(PieceType.Rook, PieceColor.White);
    Piece whiteRook_2 = new Piece(PieceType.Rook, PieceColor.White);
    Piece whiteRook_3 = new Piece(PieceType.Rook, PieceColor.White);

    //when
    pieceCounter.isPieceValidToAdd(whiteRook_1);
    pieceCounter.isPieceValidToAdd(whiteRook_2);
    pieceCounter.isPieceValidToAdd(whiteRook_3);
  }

  @Test
  public void shouldTestBean() {
    new BeanTester().testBean(PieceCounter.class);
  }
}
