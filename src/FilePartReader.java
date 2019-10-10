import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;


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

    public static List<String> read() throws IOException {
        Path dunno = FileSystems.getDefault().getPath("doc/this.txt");
        return Files.readAllLines(dunno);
    }

    public static String readLines(Integer fromLine, Integer toLine) throws IOException {
        List content = read();
        StringBuilder returnLines = null;
        for (int i = fromLine; i < toLine; i++) {
            if (content.indexOf(i) < toLine) {
                returnLines.append(content.get(i));
            }
        }
        return returnLines.toString();
    }

    public static void main(String[] args) throws IOException {
        new FilePartReader("doc/this.txt", 1, 4);
        readLines(1, 4);
    }
}
