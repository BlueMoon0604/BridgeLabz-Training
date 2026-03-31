package default_package;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFileEfficiency {
    public static void readUsingFileReader(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        while (reader.read() != -1) {
            // reading character by character
        }
        reader.close();
    }
    public static void readUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(filePath));
        while (reader.read() != -1) {
            // reading bytes and converting to characters
        }
        reader.close();
    }
    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt";
        System.out.println("File Size Test Started");

        long startTime = System.nanoTime();
        readUsingFileReader(filePath);
        long endTime = System.nanoTime();
        long fileReaderTime = endTime - startTime;

        // InputStreamReader 
        startTime = System.nanoTime();
        readUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        long inputStreamReaderTime = endTime - startTime;

        System.out.println("FileReader Time : "+ fileReaderTime / 1000000 + " ms");
        System.out.println("InputStreamReader Time : " + inputStreamReaderTime / 1000000 + " ms");
    }
}
