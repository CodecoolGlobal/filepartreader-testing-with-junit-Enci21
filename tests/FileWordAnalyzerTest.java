import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {
    private FilePartReader reader = new FilePartReader("doc/test.txt", 0, 7);
    private FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);

    @Test
    public void testGetWordsOrderedAlphabeticallyIsAlphabetically(){
        String[] words = reader.readLines().split("\n");
        String[] wordsAlphabetically = {"alma", "ananász", "banán", "eper", "körte", "sajt", "szőlő"};
        assertArrayEquals(wordsAlphabetically, analyzer.getWordsOrderedAlphabetically());
    }

    @Test
    public void testGetWordsContainingSubstring(){
        List<String> words = new ArrayList<>();
        words.add("banán");
        words.add("ananász");
        assertEquals(words,analyzer.getWordsContainingSubstring("ná") );
    }
}