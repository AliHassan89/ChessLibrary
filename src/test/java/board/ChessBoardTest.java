package board;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import exception.InvalidPieceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class ChessBoardTest {

  private static final ChessBoard chessBoard = new ChessBoard();

  @Test
  public void shouldInitializeChessBoardFromExternalFile_chess_startup() throws IOException{
    //given
    String filePath = "bin/chess-startup.txt";

    String[] boardData = new String[8];
    boardData[0] = "8 |oɹ|uʞ|ıq|nb|ıʞ|ıq|uʞ|oɹ|";
    boardData[1] = "7 |ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|";
    boardData[2] = "6 |  |  |  |  |  |  |  |  |";
    boardData[3] = "5 |  |  |  |  |  |  |  |  |";
    boardData[4] = "4 |  |  |  |  |  |  |  |  |";
    boardData[5] = "3 |  |  |  |  |  |  |  |  |";
    boardData[6] = "2 |pa|pa|pa|pa|pa|pa|pa|pa|";
    boardData[7] = "1 |ro|kn|bi|qu|ki|bi|kn|ro|";

    BoardSquare[][] expectedBoard = chessBoard.createChessBoard(boardData);


    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    checkAsserts(board, expectedBoard);
  }

  @Test
  public void shouldInitializeChessBoardFromExternalFile_chess01() throws IOException{
    //given
    String filePath = "bin/chess-01.txt";

    String[] boardData = new String[8];
    boardData[0] = "8 |oɹ|uʞ|ıq|nb|ıʞ|  |uʞ|oɹ|";
    boardData[1] = "7 |ɐd|ɐd|ɐd|  |  |ɐd|ɐd|ɐd|";
    boardData[2] = "6 |  |  |  |  |  |  |  |  |";
    boardData[3] = "5 |  |  |  |  |ɐd|  |  |qu|";
    boardData[4] = "4 |  |ıq|  |pa|ɐd|  |  |  |";
    boardData[5] = "3 |  |  |pa|  |  |  |  |  |";
    boardData[6] = "2 |pa|pa|  |  |  |pa|pa|pa|";
    boardData[7] = "1 |ro|kn|bi|  |ki|bi|kn|ro|";

    BoardSquare[][] expectedBoard = chessBoard.createChessBoard(boardData);

    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    checkAsserts(board, expectedBoard);
  }

  @Test
  public void shouldInitializeChessBoardFromExternalFile_chess02() throws IOException{
    //given
    String filePath = "bin/chess-02.txt";

    String[] boardData = new String[8];
    boardData[0] = "8 |  |oɹ|ıq|nb|ıʞ|  |  |oɹ|";
    boardData[1] = "7 |ɐd|  |  |  |uʞ|ɐd|  |ɐd|";
    boardData[2] = "6 |uʞ|  |  |  |  |  |ɐd|  |";
    boardData[3] = "5 |  |ɐd|  |  |ɐd|  |  |qu|";
    boardData[4] = "4 |  |ıq|  |pa|ɐd|  |pa|ro|";
    boardData[5] = "3 |pa|  |pa|  |bi|  |  |  |";
    boardData[6] = "2 |  |pa|  |  |  |pa|  |  |";
    boardData[7] = "1 |ro|kn|  |  |ki|bi|kn|  |";

    BoardSquare[][] expectedBoard = chessBoard.createChessBoard(boardData);

    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    checkAsserts(board, expectedBoard);
  }

  @Test
  public void shouldInitializeChessBoardFromExternalFile_chess03() throws IOException{
    //given
    String filePath = "bin/chess-03.txt";

    String[] boardData = new String[8];
    boardData[0] = "8 |  |oɹ|ıq|  |ıʞ|  |  |oɹ|";
    boardData[1] = "7 |ɐd|  |  |  |uʞ|ɐd|  |  |";
    boardData[2] = "6 |  |  |  |  |  |  |  |  |";
    boardData[3] = "5 |ıq|  |  |nb|ɐd|  |qu|  |";
    boardData[4] = "4 |  |  |  |pa|kn|  |  |ro|";
    boardData[5] = "3 |pa|  |pa|  |bi|  |  |  |";
    boardData[6] = "2 |  |  |  |  |  |pa|  |  |";
    boardData[7] = "1 |ro|  |  |  |ki|  |kn|  |";

    BoardSquare[][] expectedBoard = chessBoard.createChessBoard(boardData);

    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    checkAsserts(board, expectedBoard);
  }

  @Test(expected = FileNotFoundException.class)
  public void shouldTestWrongPath() throws IOException{
    chessBoard.createChessBoardFromFile("abcd");
  }

  @Test(expected = InvalidPieceException.class)
  public void shouldThrowInvalidPieceExceptionOnExtraPieceInBoard() throws IOException{
    //given
    String filePath = "bin/chess-extra-piece.txt";

    //when
    chessBoard.createChessBoardFromFile(filePath);
  }

  private void checkAsserts(BoardSquare[][] board, BoardSquare[][] expectedBoard){
    assertThat(board, notNullValue());
    assertThat(board[0][0].getPiece(), equalTo(expectedBoard[0][0].getPiece()));
    assertThat(board[0][1].getPiece(), equalTo(expectedBoard[0][1].getPiece()));
    assertThat(board[0][2].getPiece(), equalTo(expectedBoard[0][2].getPiece()));
    assertThat(board[0][3].getPiece(), equalTo(expectedBoard[0][3].getPiece()));
    assertThat(board[0][4].getPiece(), equalTo(expectedBoard[0][4].getPiece()));
    assertThat(board[0][5].getPiece(), equalTo(expectedBoard[0][5].getPiece()));
    assertThat(board[0][6].getPiece(), equalTo(expectedBoard[0][6].getPiece()));
    assertThat(board[0][7].getPiece(), equalTo(expectedBoard[0][7].getPiece()));

    assertThat(board[1][0].getPiece(), equalTo(expectedBoard[1][0].getPiece()));
    assertThat(board[1][1].getPiece(), equalTo(expectedBoard[1][1].getPiece()));
    assertThat(board[1][2].getPiece(), equalTo(expectedBoard[1][2].getPiece()));
    assertThat(board[1][3].getPiece(), equalTo(expectedBoard[1][3].getPiece()));
    assertThat(board[1][4].getPiece(), equalTo(expectedBoard[1][4].getPiece()));
    assertThat(board[1][5].getPiece(), equalTo(expectedBoard[1][5].getPiece()));
    assertThat(board[1][6].getPiece(), equalTo(expectedBoard[1][6].getPiece()));
    assertThat(board[1][7].getPiece(), equalTo(expectedBoard[1][7].getPiece()));

    assertThat(board[2][0].getPiece(), equalTo(expectedBoard[2][0].getPiece()));
    assertThat(board[2][1].getPiece(), equalTo(expectedBoard[2][1].getPiece()));
    assertThat(board[2][2].getPiece(), equalTo(expectedBoard[2][2].getPiece()));
    assertThat(board[2][3].getPiece(), equalTo(expectedBoard[2][3].getPiece()));
    assertThat(board[2][4].getPiece(), equalTo(expectedBoard[2][4].getPiece()));
    assertThat(board[2][5].getPiece(), equalTo(expectedBoard[2][5].getPiece()));
    assertThat(board[2][6].getPiece(), equalTo(expectedBoard[2][6].getPiece()));
    assertThat(board[2][7].getPiece(), equalTo(expectedBoard[2][7].getPiece()));

    assertThat(board[3][0].getPiece(), equalTo(expectedBoard[3][0].getPiece()));
    assertThat(board[3][1].getPiece(), equalTo(expectedBoard[3][1].getPiece()));
    assertThat(board[3][2].getPiece(), equalTo(expectedBoard[3][2].getPiece()));
    assertThat(board[3][3].getPiece(), equalTo(expectedBoard[3][3].getPiece()));
    assertThat(board[3][4].getPiece(), equalTo(expectedBoard[3][4].getPiece()));
    assertThat(board[3][5].getPiece(), equalTo(expectedBoard[3][5].getPiece()));
    assertThat(board[3][6].getPiece(), equalTo(expectedBoard[3][6].getPiece()));
    assertThat(board[3][7].getPiece(), equalTo(expectedBoard[3][7].getPiece()));

    assertThat(board[4][0].getPiece(), equalTo(expectedBoard[4][0].getPiece()));
    assertThat(board[4][1].getPiece(), equalTo(expectedBoard[4][1].getPiece()));
    assertThat(board[4][2].getPiece(), equalTo(expectedBoard[4][2].getPiece()));
    assertThat(board[4][3].getPiece(), equalTo(expectedBoard[4][3].getPiece()));
    assertThat(board[4][4].getPiece(), equalTo(expectedBoard[4][4].getPiece()));
    assertThat(board[4][5].getPiece(), equalTo(expectedBoard[4][5].getPiece()));
    assertThat(board[4][6].getPiece(), equalTo(expectedBoard[4][6].getPiece()));
    assertThat(board[4][7].getPiece(), equalTo(expectedBoard[4][7].getPiece()));

    assertThat(board[5][0].getPiece(), equalTo(expectedBoard[5][0].getPiece()));
    assertThat(board[5][1].getPiece(), equalTo(expectedBoard[5][1].getPiece()));
    assertThat(board[5][2].getPiece(), equalTo(expectedBoard[5][2].getPiece()));
    assertThat(board[5][3].getPiece(), equalTo(expectedBoard[5][3].getPiece()));
    assertThat(board[5][4].getPiece(), equalTo(expectedBoard[5][4].getPiece()));
    assertThat(board[5][5].getPiece(), equalTo(expectedBoard[5][5].getPiece()));
    assertThat(board[5][6].getPiece(), equalTo(expectedBoard[5][6].getPiece()));
    assertThat(board[5][7].getPiece(), equalTo(expectedBoard[5][7].getPiece()));

    assertThat(board[6][0].getPiece(), equalTo(expectedBoard[6][0].getPiece()));
    assertThat(board[6][1].getPiece(), equalTo(expectedBoard[6][1].getPiece()));
    assertThat(board[6][2].getPiece(), equalTo(expectedBoard[6][2].getPiece()));
    assertThat(board[6][3].getPiece(), equalTo(expectedBoard[6][3].getPiece()));
    assertThat(board[6][4].getPiece(), equalTo(expectedBoard[6][4].getPiece()));
    assertThat(board[6][5].getPiece(), equalTo(expectedBoard[6][5].getPiece()));
    assertThat(board[6][6].getPiece(), equalTo(expectedBoard[6][6].getPiece()));
    assertThat(board[6][7].getPiece(), equalTo(expectedBoard[6][7].getPiece()));

    assertThat(board[7][0].getPiece(), equalTo(expectedBoard[7][0].getPiece()));
    assertThat(board[7][1].getPiece(), equalTo(expectedBoard[7][1].getPiece()));
    assertThat(board[7][2].getPiece(), equalTo(expectedBoard[7][2].getPiece()));
    assertThat(board[7][3].getPiece(), equalTo(expectedBoard[7][3].getPiece()));
    assertThat(board[7][4].getPiece(), equalTo(expectedBoard[7][4].getPiece()));
    assertThat(board[7][5].getPiece(), equalTo(expectedBoard[7][5].getPiece()));
    assertThat(board[7][6].getPiece(), equalTo(expectedBoard[7][6].getPiece()));
    assertThat(board[7][7].getPiece(), equalTo(expectedBoard[7][7].getPiece()));
  }
}
