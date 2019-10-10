import java.io.IOException;
import java.util.List;

public class FileWordAnalyzer {

    public FileWordAnalyzer(FilePartReader reader) {

    }

    public List getWordsOrderedAlphabetically() throws IOException {
        FilePartReader reader = new FilePartReader("doc/this.txt", 1, 5);
        reader.readLines();


    }
}
