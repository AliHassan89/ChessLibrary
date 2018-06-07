package piece;

import constant.ChessConstants;
import exception.InvalidPieceException;
import org.springframework.stereotype.Component;

@Component
public final class PieceCounter {

  private int whiteRookCount;
  private int whiteBishopCount;
  private int whiteKnightCount;
  private int whiteQueenCount;
  private int whiteKingCount;

  private int whitePawnCount;

  private int blackRookCount;
  private int blackBishopCount;
  private int blackKnightCount;
  private int blackQueenCount;
  private int blackKingCount;
  private int blackPawnCount;

  public PieceCounter(){
    initCounters();
  }

  public void initCounters(){
    whiteRookCount = 0;
    whiteBishopCount = 0;
    whiteKnightCount = 0;
    whiteQueenCount = 0;
    whiteKingCount = 0;
    whitePawnCount = 0;

    blackRookCount = 0;
    blackBishopCount = 0;
    blackKnightCount = 0;
    blackQueenCount = 0;
    blackKingCount = 0;
    blackPawnCount = 0;
  }

  /**
   * Checks if the board has right number of pieces being added.
   * returns false if any piece count goes above the actual number of pieces which are allowed
   * in game of chess.
   *
   * @return boolean if number of pieces of type are less than or equal to required pieces
   */
  public boolean isPieceValidToAdd(Piece piece) {
    if (piece == null) {
      throw new InvalidPieceException("Piece is null");
    }

    if (piece.getPieceColor() == PieceColor.Black){
      switch(piece.getPieceType()){
        case Pawn:
          blackPawnCount++;
          if (blackPawnCount > ChessConstants.BLACK_PAWN_COUNT)
            throw new InvalidPieceException("Black Pawn count exceeded");
          break;
        case Rook:
          blackRookCount++;
          if (blackRookCount > ChessConstants.BLACK_ROOK_COUNT)
            throw new InvalidPieceException("Black Rook count exceeded");
          break;
        case Bishop:
          blackBishopCount++;
          if (blackBishopCount > ChessConstants.BLACK_BISHOP_COUNT)
            throw new InvalidPieceException("Black Bishop count exceeded");
          break;
        case Knight:
          blackKnightCount++;
          if (blackKnightCount > ChessConstants.BLACK_KNIGHT_COUNT)
            throw new InvalidPieceException("Black Knight count exceeded");
          break;
        case King:
          blackKingCount++;
          if (blackKingCount > ChessConstants.BLACK_KING_COUNT)
            throw new InvalidPieceException("Black King count exceeded");
          break;
        case Queen:
          blackQueenCount++;
          if (blackQueenCount > ChessConstants.BLACK_QUEEN_COUNT)
            throw new InvalidPieceException("Black Queen count exceeded");
          break;
      }
    }
    else{
      switch(piece.getPieceType()){
        case Pawn:
          whitePawnCount++;
          if (whitePawnCount > ChessConstants.WHITE_PAWN_COUNT)
            throw new InvalidPieceException("White Pawn count exceeded");
          break;
        case Rook:
          whiteRookCount++;
          if (whiteRookCount > ChessConstants.WHITE_ROOK_COUNT)
            throw new InvalidPieceException("White Rook count exceeded");
          break;
        case Bishop:
          whiteBishopCount++;
          if (whiteBishopCount > ChessConstants.WHITE_BISHOP_COUNT)
            throw new InvalidPieceException("White Bishop count exceeded");
          break;
        case Knight:
          whiteKnightCount++;
          if (whiteKnightCount > ChessConstants.WHITE_KNIGHT_COUNT)
            throw new InvalidPieceException("White Knight count exceeded");
          break;
        case King:
          whiteKingCount++;
          if (whiteKingCount > ChessConstants.WHITE_KING_COUNT)
            throw new InvalidPieceException("White King count exceeded");
          break;
        case Queen:
          whiteQueenCount++;
          if (whiteQueenCount > ChessConstants.WHITE_QUEEN_COUNT)
            throw new InvalidPieceException("White Queen count exceeded");
          break;
      }
    }

    return true;
  }

  public int getWhiteRookCount() {
    return whiteRookCount;
  }

  public void setWhiteRookCount(int whiteRookCount) {
    this.whiteRookCount = whiteRookCount;
  }

  public int getWhiteBishopCount() {
    return whiteBishopCount;
  }

  public void setWhiteBishopCount(int whiteBishopCount) {
    this.whiteBishopCount = whiteBishopCount;
  }

  public int getWhiteKnightCount() {
    return whiteKnightCount;
  }

  public void setWhiteKnightCount(int whiteKnightCount) {
    this.whiteKnightCount = whiteKnightCount;
  }

  public int getWhiteQueenCount() {
    return whiteQueenCount;
  }

  public void setWhiteQueenCount(int whiteQueenCount) {
    this.whiteQueenCount = whiteQueenCount;
  }

  public int getWhiteKingCount() {
    return whiteKingCount;
  }

  public void setWhiteKingCount(int whiteKingCount) {
    this.whiteKingCount = whiteKingCount;
  }

  public int getWhitePawnCount() {
    return whitePawnCount;
  }

  public void setWhitePawnCount(int whitePawnCount) {
    this.whitePawnCount = whitePawnCount;
  }

  public int getBlackRookCount() {
    return blackRookCount;
  }

  public void setBlackRookCount(int blackRookCount) {
    this.blackRookCount = blackRookCount;
  }

  public int getBlackBishopCount() {
    return blackBishopCount;
  }

  public void setBlackBishopCount(int blackBishopCount) {
    this.blackBishopCount = blackBishopCount;
  }

  public int getBlackKnightCount() {
    return blackKnightCount;
  }

  public void setBlackKnightCount(int blackKnightCount) {
    this.blackKnightCount = blackKnightCount;
  }

  public int getBlackQueenCount() {
    return blackQueenCount;
  }

  public void setBlackQueenCount(int blackQueenCount) {
    this.blackQueenCount = blackQueenCount;
  }

  public int getBlackKingCount() {
    return blackKingCount;
  }

  public void setBlackKingCount(int blackKingCount) {
    this.blackKingCount = blackKingCount;
  }

  public int getBlackPawnCount() {
    return blackPawnCount;
  }

  public void setBlackPawnCount(int blackPawnCount) {
    this.blackPawnCount = blackPawnCount;
  }
}
