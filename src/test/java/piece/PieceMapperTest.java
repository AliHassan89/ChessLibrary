package piece;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class PieceMapperTest {

  private static final PieceMapper pieceMapper = new PieceMapper();

  @Test
  public void shouldTestPieceType(){
    //given
    String whitePawn = "pa";
    String whiteRook = "ro";
    String whiteKnight = "kn";
    String whiteBishop = "bi";
    String whiteQueen = "qu";
    String whiteKing = "ki";

    String blackPawn = "ɐd";
    String blackRook = "oɹ";
    String blackKnight = "uʞ";
    String blackBishop = "ıq";
    String blackQueen = "nb";
    String blackKing = "ıʞ";

    //then
    assertThat(pieceMapper.getPieceType(whitePawn), equalTo(PieceType.Pawn));
    assertThat(pieceMapper.getPieceType(whiteRook), equalTo(PieceType.Rook));
    assertThat(pieceMapper.getPieceType(whiteKnight), equalTo(PieceType.Knight));
    assertThat(pieceMapper.getPieceType(whiteBishop), equalTo(PieceType.Bishop));
    assertThat(pieceMapper.getPieceType(whiteQueen), equalTo(PieceType.Queen));
    assertThat(pieceMapper.getPieceType(whiteKing), equalTo(PieceType.King));

    assertThat(pieceMapper.getPieceType(blackPawn), equalTo(PieceType.Pawn));
    assertThat(pieceMapper.getPieceType(blackRook), equalTo(PieceType.Rook));
    assertThat(pieceMapper.getPieceType(blackKnight), equalTo(PieceType.Knight));
    assertThat(pieceMapper.getPieceType(blackBishop), equalTo(PieceType.Bishop));
    assertThat(pieceMapper.getPieceType(blackQueen), equalTo(PieceType.Queen));
    assertThat(pieceMapper.getPieceType(blackKing), equalTo(PieceType.King));
  }

  @Test
  public void shouldTestPieceColor(){
    //given
    String whitePawn = "pa";
    String whiteRook = "ro";
    String whiteKnight = "kn";
    String whiteBishop = "bi";
    String whiteQueen = "qu";
    String whiteKing = "ki";

    String blackPawn = "ɐd";
    String blackRook = "oɹ";
    String blackKnight = "uʞ";
    String blackBishop = "ıq";
    String blackQueen = "nb";
    String blackKing = "ıʞ";

    //then
    assertThat(pieceMapper.getPieceColor(whitePawn), equalTo(PieceColor.White));
    assertThat(pieceMapper.getPieceColor(whiteRook), equalTo(PieceColor.White));
    assertThat(pieceMapper.getPieceColor(whiteKnight), equalTo(PieceColor.White));
    assertThat(pieceMapper.getPieceColor(whiteBishop), equalTo(PieceColor.White));
    assertThat(pieceMapper.getPieceColor(whiteQueen), equalTo(PieceColor.White));
    assertThat(pieceMapper.getPieceColor(whiteKing), equalTo(PieceColor.White));

    assertThat(pieceMapper.getPieceColor(blackPawn), equalTo(PieceColor.Black));
    assertThat(pieceMapper.getPieceColor(blackRook), equalTo(PieceColor.Black));
    assertThat(pieceMapper.getPieceColor(blackKnight), equalTo(PieceColor.Black));
    assertThat(pieceMapper.getPieceColor(blackBishop), equalTo(PieceColor.Black));
    assertThat(pieceMapper.getPieceColor(blackQueen), equalTo(PieceColor.Black));
    assertThat(pieceMapper.getPieceColor(blackKing), equalTo(PieceColor.Black));
  }

}
