package collections;

import java.io.*;

public class CompileTimeException {
    public static void main(String[] args) {
        CompileTimeException reader = new CompileTimeException();
        reader.readFile("data.txt");
    }
    public void readFile(String filename) {
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            System.out.println("File contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
