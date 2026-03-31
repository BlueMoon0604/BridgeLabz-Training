package default_package;

import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        String filename = "user-inputs.txt";
        try (BufferedReader consoleReader = new BufferedReader(
                new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter(filename, true)) {
            System.out.println("Enter text (type 'exit' to stop):");
            String input;
            while (!(input = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input + "\n");
                System.out.println("Written: " + input);
            }
            System.out.println("File saved as " + filename);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
