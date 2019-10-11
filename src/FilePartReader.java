
import java.io.IOException;
import java.nio.file.*;


public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;


    public FilePartReader(String filePath, Integer fromLine, Integer toLine) {
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException("Whaat?!");
        }
    }

    public String read(){
        Path dunno = FileSystems.getDefault().getPath("doc/this.txt");
        try {
            return new String(Files.readAllBytes(dunno));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readLines() {
        String[] content = read().split("\n");
        StringBuilder returnLines = new StringBuilder();
        if (fromLine > 0) {
            for (int i = fromLine - 1; i < toLine; i++) {
                returnLines.append(content[i]);
                returnLines.append("\n");
            }
        }
        return returnLines.toString();
    }
}
