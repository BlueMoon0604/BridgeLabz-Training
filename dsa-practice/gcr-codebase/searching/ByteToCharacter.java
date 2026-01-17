package default_package;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteToCharacter {
    public static void readWithInputStreamReader(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        readWithInputStreamReader("utf8-sample.txt");
    }
}
