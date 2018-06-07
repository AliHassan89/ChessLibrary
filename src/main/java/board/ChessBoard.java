package board;

import fileIO.FileParser;
import java.io.IOException;
import piece.Piece;
import piece.PieceCounter;
import piece.PieceMapper;

public final class ChessBoard implements Board{

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

  @Override
  public BoardSquare[][] initializeBoardFromFile(String path) throws IOException{
    String[] boardData = fileParser.readFileFromPath(path);
    return initializeBoardFromBoardData(boardData);
  }

  @Override
  public BoardSquare[][] initializeBoardFromBoardData(String[] boardData){
    int rowIndex = 0;
    pieceCounter.initCounters();
    for (String row : boardData){
      String[] splittedRow = row.split("\\|");
      for (int i=1; i<splittedRow.length; i++){
        String currPieceStr = splittedRow[i].trim();
        if (!currPieceStr.isEmpty()) {
          Piece currPiece = new Piece(pieceMapper.getPieceType(currPieceStr), pieceMapper.getPieceColor(currPieceStr));
          if (pieceCounter.isPieceValidToAdd(currPiece)) {
            board[rowIndex][i-1] = new BoardSquare(currPiece, rowIndex, i-1);
          }
        }else{
          board[rowIndex][i-1] = new BoardSquare(rowIndex, i-1);
        }
      }
      rowIndex++;
    }

    return board;
  }
}
