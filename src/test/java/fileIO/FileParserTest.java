package fileIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileParserTest {

  private FileParser fileParser = new FileParser();

  @Test
  public void shouldReadFromFilePath() throws IOException{
    //given
    String path = "bin/chess-startup.txt";

    String[] expectedData = new String[8];
    expectedData[0] = "8 |oɹ|uʞ|ıq|nb|ıʞ|ıq|uʞ|oɹ|";
    expectedData[1] = "7 |ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|ɐd|";
    expectedData[2] = "6 |  |  |  |  |  |  |  |  |";
    expectedData[3] = "5 |  |  |  |  |  |  |  |  |";
    expectedData[4] = "4 |  |  |  |  |  |  |  |  |";
    expectedData[5] = "3 |  |  |  |  |  |  |  |  |";
    expectedData[6] = "2 |pa|pa|pa|pa|pa|pa|pa|pa|";
    expectedData[7] = "1 |ro|kn|bi|qu|ki|bi|kn|ro|";

    //when
    String[] fileData = fileParser.readFileFromPath(path);

    //then
    assertThat(fileData, notNullValue());
    assertThat(fileData.length, equalTo(8));
    assertThat(fileData, equalTo(expectedData));
  }

  @Test(expected = FileNotFoundException.class)
  public void shouldThrowExceptionOnWrongPath() throws IOException{
    fileParser.readFileFromPath("abcd");
  }
}
