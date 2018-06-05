import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class FileParser {

  public String readFile(String path) {
    StringBuilder sb = new StringBuilder();
    try{
      Optional<BufferedReader> brOptional = Optional.of(new BufferedReader(new FileReader(path)));
      if (!brOptional.isPresent()) {
        throw new FileNotFoundException();
      }
      BufferedReader br = brOptional.get();
      String record = "";
      while ((record = br.readLine()) != null) {
        sb.append(record);
        sb.append("\n");
      }
    }catch (IOException e){
      e.printStackTrace();
    }

    return sb.toString();
  }
}
