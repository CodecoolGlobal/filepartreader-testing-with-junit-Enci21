
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

    public String read() {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("This file doesn't exist.");
        return "";
    }

    public String readLines() {
        String[] content = read().split("\n");
        StringBuilder returnLines = new StringBuilder();
        if (fromLine > 0) {
            for (int i = fromLine - 1; i < toLine; i++) {
                returnLines.append(content[i]);
                returnLines.append("\n");
            }
            return returnLines.toString();
        } else {
            for (int i = fromLine; i < toLine; i++) {
                returnLines.append(content[i]);
                returnLines.append("\n");
            }
            return returnLines.toString();
        }
    }
}
