package board;

import fileIO.FileParser;
import java.io.IOException;
import piece.Piece;
import piece.PieceCounter;
import piece.PieceMapper;

public class ChessBoard {

  private BoardSquare[][] board;

  private final FileParser fileParser;
  private final PieceMapper pieceMapper;
  private final PieceCounter pieceCounter;

  public ChessBoard(){
    fileParser = new FileParser();
    pieceMapper = new PieceMapper();
    pieceCounter = new PieceCounter();
    board = new BoardSquare[8][8];
  }

  public BoardSquare[][] createChessBoardFromFile(String path) throws IOException{
    String[] boardData = fileParser.readFile(path);
    return createChessBoard(boardData);
  }

  private BoardSquare[][] createChessBoard(String[] boardData){
    int rowIndex = 0;
    for (String row : boardData){
      String[] splittedRow = row.split("\\|");
      for (int i=1; i<splittedRow.length; i++){
        String currPieceStr = splittedRow[i].trim();
        if (!currPieceStr.isEmpty()) {
          Piece currPiece = new Piece(pieceMapper.getPieceType(currPieceStr), pieceMapper.getPieceColor(currPieceStr));
          if (pieceCounter.isPieceValidToAdd(currPiece)) {
            board[rowIndex][i-1] = new BoardSquare(currPiece, rowIndex, i-1);
          }
        }
      }
      rowIndex++;
    }

    return board;
  }
}
