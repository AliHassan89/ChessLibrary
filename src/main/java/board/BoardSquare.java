package board;

import org.springframework.stereotype.Component;
import piece.Piece;

@Component
public final class BoardSquare {

  private Piece piece;
  private int xPos;
  private int yPos;

  public BoardSquare(){
    xPos = 0;
    yPos = 0;
  }

  public BoardSquare(Piece piece){
    new BoardSquare();
    this.piece = piece;
  }

  public BoardSquare(Piece piece, int xPos, int yPos){
    new BoardSquare(piece);
    this.xPos = xPos;
    this.yPos = yPos;
  }

  public Piece getPiece() {
    return piece;
  }

  public void setPiece(Piece piece) {
    this.piece = piece;
  }

  public int get_xPos() {
    return xPos;
  }

  public void set_xPos(int xPos) {
    this.xPos = xPos;
  }

  public int get_yPos() {
    return yPos;
  }

  public void set_yPos(int yPos) {
    this.yPos = yPos;
  }
}
