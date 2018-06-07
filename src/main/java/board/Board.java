package board;

import java.io.IOException;

public interface Board {
  BoardSquare[][] initializeBoardFromFile(String filePath) throws IOException;
  BoardSquare[][] initializeBoardFromBoardData(String[] boardData);
}
