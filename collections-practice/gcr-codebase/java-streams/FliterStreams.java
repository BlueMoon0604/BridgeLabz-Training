package collections;

import java.io.*;

public class FliterStreams{
    public static void main(String[] args) {

        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));

                BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))
        ) {
            int ch;

            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully!");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
