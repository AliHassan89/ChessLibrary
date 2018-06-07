package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FileParser implements IOParser {

  @Override
  public String[] readFileFromPath(String path) throws IOException{
    String[] records = new String[8];
    try{
      Optional<BufferedReader> brOptional = Optional.of(new BufferedReader(new FileReader(path)));
      BufferedReader br = brOptional.get();
      String record;
      int count = 0;
      while (count < 8 && (record = br.readLine()) != null) {
        records[count] = record;
        count++;
      }
    }
    catch (IOException e){
      Logger.getLogger(FileParser.class.getName()).log(Level.SEVERE, "Wrong input file path", e);
      throw e;
    }

    return records;
  }
}
