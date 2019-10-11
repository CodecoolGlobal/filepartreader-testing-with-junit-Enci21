import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    @Test
    public void testGetWordsOrderedAlphabeticallyIsAlphabetically(){
        FilePartReader reader = new FilePartReader("doc/test.txt", 1, 4);
        FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);
        String[] words = reader.readLines().replace("\n", " ").split(" ");
        analyzer.getWordsOrderedAlphabetically().equals(words);
    }


}