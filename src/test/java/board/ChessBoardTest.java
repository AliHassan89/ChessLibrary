package board;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import fileIO.FileParser;
import java.io.IOException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import piece.Piece;
import piece.PieceCounter;
import piece.PieceMapper;
import piece.PieceType;

@RunWith(MockitoJUnitRunner.class)
public class ChessBoardTest {

  @Mock
  private FileParser fileParser;

  @Mock
  private PieceMapper pieceMapper;

  @Mock
  private PieceCounter pieceCounter;

  @InjectMocks
  private ChessBoard chessBoard;

  @Test
  public void shouldInitializeChessBoardFromExternalFile() throws IOException{
    //given
    String filePath = "bin/chess-startup.txt";
    BoardSquare[][] expectedBoard = mock(BoardSquare[][].class);

    String[] boardData = new String[8];
    boardData[0] = "8 |oɹ|uʞ|ıq|nb|ıʞ|ıq|uʞ|oɹ|";
    boardData[1] = "7 |ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|";
    boardData[2] = "6 |  |  |  |  |  |  |  |  |";
    boardData[3] = "5 |  |  |  |  |  |  |  |  |";
    boardData[4] = "4 |  |  |  |  |  |  |  |  |";
    boardData[5] = "3 |  |  |  |  |  |  |  |  |";
    boardData[6] = "2 |pa|pa|pa|pa|pa|pa|pa|pa|";
    boardData[7] = "1 |ro|kn|bi|qu|ki|bi|kn|ro|";


    int rowIndex = 0;
    for (String row : boardData){
      String[] splittedRow = row.split("|");
      for (int i=1; i<splittedRow.length; i++){
        expectedBoard[rowIndex][i].set_xPos(rowIndex);
        expectedBoard[rowIndex][i].set_yPos(i);

        String currPieceStr = splittedRow[i];
        if (!currPieceStr.isEmpty()) {
          Piece currPiece = mock(Piece.class);
          when(pieceMapper.getPieceType(currPieceStr)).thenReturn(PieceType.Pawn);
              new Piece(pieceMapper.getPieceType(currPieceStr), pieceMapper.getPieceColor(currPieceStr));
          if (pieceCounter.isPieceValidToAdd(currPiece)) {
            expectedBoard[rowIndex][i].setPiece(currPiece);
          }
        }
      }
      rowIndex++;
    }


    when(fileParser.readFile(filePath)).thenReturn(boardData);

    //when
    BoardSquare[][] board = chessBoard.createChessBoardFromFile(filePath);

    //then
    assertThat(board, notNullValue());
  }
}
