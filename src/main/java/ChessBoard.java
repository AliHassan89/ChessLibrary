import piece.Piece;
import piece.PieceColor;
import piece.PieceType;

public class ChessBoard {

  private BoardSquare[][] board;

  public ChessBoard(){
    board = new BoardSquare[8][8];
    initializeSquarePositions();
    initializePieces();
  }

  public ChessBoard(String fileInput){

  }

  private void initializePieces() {
    //black pieces
    board[0][0].setPiece(new Piece(PieceType.Rook, PieceColor.Black));
    board[0][1].setPiece(new Piece(PieceType.Knight, PieceColor.Black));
    board[0][2].setPiece(new Piece(PieceType.Bishop, PieceColor.Black));
    board[0][3].setPiece(new Piece(PieceType.Queen, PieceColor.Black));
    board[0][4].setPiece(new Piece(PieceType.King, PieceColor.Black));
    board[0][5].setPiece(new Piece(PieceType.Bishop, PieceColor.Black));
    board[0][6].setPiece(new Piece(PieceType.Knight, PieceColor.Black));
    board[0][7].setPiece(new Piece(PieceType.Rook, PieceColor.Black));
    for (int i=0; i<8; i++){
      board[1][i].setPiece(new Piece(PieceType.Pawn, PieceColor.Black));
    }

    //white pieces
    for (int i=0; i<8; i++){
      board[6][i].setPiece(new Piece(PieceType.Pawn, PieceColor.White));
    }
    board[7][0].setPiece(new Piece(PieceType.Rook, PieceColor.White));
    board[7][1].setPiece(new Piece(PieceType.Knight, PieceColor.White));
    board[7][2].setPiece(new Piece(PieceType.Bishop, PieceColor.White));
    board[7][3].setPiece(new Piece(PieceType.Queen, PieceColor.White));
    board[7][4].setPiece(new Piece(PieceType.King, PieceColor.White));
    board[7][5].setPiece(new Piece(PieceType.Bishop, PieceColor.White));
    board[7][6].setPiece(new Piece(PieceType.Knight, PieceColor.White));
    board[7][7].setPiece(new Piece(PieceType.Rook, PieceColor.White));
  }

  private void initializeSquarePositions() {
    for (int i=0; i<8; i++){
      for (int j=0; j<8; j++){
        board[i][j].set_xPos(i);
        board[i][j].set_yPos(j);
      }
    }
  }

}
