import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    @Test
    public void testReadCatchTheException(){
        FilePartReader reader = new FilePartReader("doc/h.txt", 1, 5);
        reader.read();
    }

}