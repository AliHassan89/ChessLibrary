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

  public BoardSquare(int xPos, int yPos){
    set_xPos(xPos);
    set_yPos(yPos);
    setPiece(null);
  }

  public BoardSquare(Piece piece, int xPos, int yPos){
    setPiece(piece);
    set_xPos(xPos);
    set_yPos(yPos);
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
