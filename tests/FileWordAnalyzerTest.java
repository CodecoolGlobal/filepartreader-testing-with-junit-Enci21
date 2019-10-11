import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {
    private FilePartReader reader = new FilePartReader("doc/test.txt", 1, 4);
    private FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);

    @Test
    public void testGetWordsOrderedAlphabeticallyIsAlphabetically(){
        String[] words = reader.readLines().replace("\n", " ").split(" ");
        analyzer.getWordsOrderedAlphabetically().equals(words);
    }

    @Test
    public void testGetWordsContainingSubstring(){
        List<String> words = new ArrayList<>();
        words.add("banán");
        words.add("ananász");
        words.equals(analyzer.getWordsContainingSubstring("ná"));
    }
}