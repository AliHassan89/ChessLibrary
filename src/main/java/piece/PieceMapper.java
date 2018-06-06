package piece;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class PieceMapper {

  private Map<String, PieceType> pieceTypeMapper;
  private Map<String, PieceColor> pieceColorMapper;

  public PieceMapper(){
    initializeMappers();
  }

  public PieceType getPieceType(String piece){
    return pieceTypeMapper.get(piece);
  }

  public PieceColor getPieceColor(String piece){
    return pieceColorMapper.get(piece);
  }

  private void initializeMappers() {
    pieceTypeMapper = new HashMap<>();
    pieceTypeMapper.put("pa", PieceType.Pawn);
    pieceTypeMapper.put("ro", PieceType.Rook);
    pieceTypeMapper.put("kn", PieceType.Knight);
    pieceTypeMapper.put("bi", PieceType.Bishop);
    pieceTypeMapper.put("qu", PieceType.Queen);
    pieceTypeMapper.put("ki", PieceType.King);

    pieceTypeMapper.put("ɐd", PieceType.Pawn);
    pieceTypeMapper.put("oɹ", PieceType.Rook);
    pieceTypeMapper.put("uʞ", PieceType.Knight);
    pieceTypeMapper.put("ıq", PieceType.Bishop);
    pieceTypeMapper.put("nb", PieceType.Queen);
    pieceTypeMapper.put("ıʞ", PieceType.King);

    pieceColorMapper = new HashMap<>();
    pieceColorMapper.put("pa", PieceColor.White);
    pieceColorMapper.put("ro", PieceColor.White);
    pieceColorMapper.put("kn", PieceColor.White);
    pieceColorMapper.put("bi", PieceColor.White);
    pieceColorMapper.put("qu", PieceColor.White);
    pieceColorMapper.put("ki", PieceColor.White);

    pieceColorMapper.put("ɐd", PieceColor.Black);
    pieceColorMapper.put("oɹ", PieceColor.Black);
    pieceColorMapper.put("uʞ", PieceColor.Black);
    pieceColorMapper.put("ıq", PieceColor.Black);
    pieceColorMapper.put("nb", PieceColor.Black);
    pieceColorMapper.put("ıʞ", PieceColor.Black);
  }
}
