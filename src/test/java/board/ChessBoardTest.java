package board;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import org.junit.Test;
import piece.Piece;
import piece.PieceColor;
import piece.PieceType;

public class ChessBoardTest {

  private static final ChessBoard chessBoard = new ChessBoard();

  @Test
  public void shouldInitializeChessBoardFromExternalFile() throws IOException{
    //given
    String filePath = "bin/chess-startup.txt";
    BoardSquare[][] expectedBoard = new BoardSquare[8][8];

    String[] boardData = new String[8];
    boardData[0] = "8 |oɹ|uʞ|ıq|nb|ıʞ|ıq|uʞ|oɹ|";
    boardData[1] = "7 |ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|";
    boardData[2] = "6 |  |  |  |  |  |  |  |  |";
    boardData[3] = "5 |  |  |  |  |  |  |  |  |";
    boardData[4] = "4 |  |  |  |  |  |  |  |  |";
    boardData[5] = "3 |  |  |  |  |  |  |  |  |";
    boardData[6] = "2 |pa|pa|pa|pa|pa|pa|pa|pa|";
    boardData[7] = "1 |ro|kn|bi|qu|ki|bi|kn|ro|";

    expectedBoard[0][0] = new BoardSquare(new Piece(PieceType.Rook, PieceColor.Black));

    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    assertThat(board, notNullValue());
  }
}
