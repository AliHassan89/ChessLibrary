package board;

import fileIO.FileParser;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import piece.Piece;
import piece.PieceCounter;
import piece.PieceMapper;

public class ChessBoard {

  private BoardSquare[][] board;

  private final FileParser fileParser;
  private final PieceMapper pieceMapper;
  private final PieceCounter pieceCounter;

  @Autowired
  public ChessBoard(FileParser parser, PieceMapper mapper, PieceCounter counter){
    this.fileParser = parser;
    this.pieceMapper = mapper;
    this.pieceCounter = counter;
    board = new BoardSquare[8][8];
  }

  public BoardSquare[][] createChessBoardFromFile(String path) throws IOException{
    String[] boardData = fileParser.readFile(path);
    return createChessBoard(boardData);
  }

  public BoardSquare[][] createChessBoard(String[] boardData){
    int rowIndex = 0;
    for (String row : boardData){
      String[] splittedRow = row.split("|");
      for (int i=1; i<splittedRow.length; i++){
        board[rowIndex][i].set_xPos(rowIndex);
        board[rowIndex][i].set_yPos(i);

        String currPieceStr = splittedRow[i];
        if (!currPieceStr.isEmpty()) {
          Piece currPiece = new Piece(pieceMapper.getPieceType(currPieceStr), pieceMapper.getPieceColor(currPieceStr));
          if (pieceCounter.isPieceValidToAdd(currPiece)) {
            board[rowIndex][i].setPiece(currPiece);
          }
        }
      }
      rowIndex++;
    }

    return board;
  }
}
