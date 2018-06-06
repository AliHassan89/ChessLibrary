package fileIO;

import fileIO.FileParser;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileParserTest {

  private FileParser fileParser = new FileParser();

  @Test
  public void shouldReadFromFilePath(){
    //given
    String path = "bin/chess-startup.txt";

    //when
    String[] fileData = fileParser.readFile(path);

    //then
    assertThat(fileData, notNullValue());
  }
}
