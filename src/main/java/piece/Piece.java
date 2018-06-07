package piece;

import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public final class Piece {

  private PieceType pieceType;
  private PieceColor pieceColor;

  public Piece(){

  }

  public Piece(PieceType type, PieceColor color){
    setPieceType(type);
    setPieceColor(color);
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Piece piece = (Piece) o;
    return Objects.equals(pieceType, piece.pieceType) &&
        Objects.equals(pieceColor, piece.pieceColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pieceType, pieceColor);
  }
}
