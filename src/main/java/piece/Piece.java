package piece;

public class Piece {

  private PieceType pieceType;
  private PieceColor pieceColor;

  public Piece(PieceType type, PieceColor color){
    this.pieceType = type;
    this.pieceColor = color;
  }

  public PieceType getPieceType() {
    return pieceType;
  }

  public void setPieceType(PieceType pieceType) {
    this.pieceType = pieceType;
  }

  public PieceColor getPieceColor() {
    return pieceColor;
  }

  public void setPieceColor(PieceColor pieceColor) {
    this.pieceColor = pieceColor;
  }
}
