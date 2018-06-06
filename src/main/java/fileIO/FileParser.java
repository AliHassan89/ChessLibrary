package fileIO;

import exception.WrongInputFileException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class FileParser {

  public String[] readFile(String path) {
    String[] records = new String[8];
    try{
      Optional<BufferedReader> brOptional = Optional.of(new BufferedReader(new FileReader(path)));
      if (!brOptional.isPresent()) {
        throw new FileNotFoundException();
      }
      BufferedReader br = brOptional.get();
      String record;
      int count = 0;
      while (count < 8 && (record = br.readLine()) != null) {
        records[count] = record;
        count++;
      }
      if (count != 8){
        throw new WrongInputFileException();
      }
    }catch (IOException e){
      e.printStackTrace();
      System.out.println("Wrong input file path");
    } catch (WrongInputFileException e) {
      System.out.println("Inputfile does not have correct number of rows");
    }

    return records;
  }
}
