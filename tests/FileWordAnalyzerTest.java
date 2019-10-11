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
        String[] words = reader.readLines().split("\n");
        String[] wordsAlphabetically = {"alma", "ananász", "banán", "eper", "kávé", "körte", "sajt", "szőlő"};
        for (String word : words){
            System.out.println(word);
        }
        System.out.println();
        for (String w : wordsAlphabetically){
            System.out.println(w);
        }
        assertEquals(wordsAlphabetically, analyzer.getWordsOrderedAlphabetically());
    }

    @Test
    public void testGetWordsContainingSubstring(){
        List<String> words = new ArrayList<>();
        words.add("banán");
        words.add("ananász");
        assertEquals(words,analyzer.getWordsContainingSubstring("ná") );
    }
}