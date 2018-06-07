package fileIO;

import java.io.IOException;

public interface IOParser {
  String[] readFileFromPath(String path) throws IOException;
}
