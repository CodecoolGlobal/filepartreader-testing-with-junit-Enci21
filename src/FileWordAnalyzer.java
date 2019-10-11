import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {

    private FilePartReader reader = new FilePartReader("doc/this.txt", 1, 5);

    public FileWordAnalyzer(FilePartReader reader) {

    }

    public String[] getWordsOrderedAlphabetically() {
        String[] words = reader.readLines().split("\n");
        Arrays.sort(words);
        return words;
    }

    public List getWordsContainingSubstring(String subString) {
        String[] words = reader.readLines().replace("\n", " ").split("\n");
        List<String> wordsContainsSubString = new ArrayList<>();
        for (String word : words) {
            if (word.contains(subString)) {
                wordsContainsSubString.add(word);
            }
        }
        return wordsContainsSubString;
    }

    public List getStringsWhichPalindromes() {
        String[] words = reader.readLines().replace("\n", " ").split(" ");
        List<String> palindromes = new ArrayList<>();
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                palindromes.add(new StringBuilder(word).reverse().toString());
            }
        }
        return palindromes;
    }

}
