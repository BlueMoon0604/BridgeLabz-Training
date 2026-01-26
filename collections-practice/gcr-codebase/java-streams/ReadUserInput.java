package collections;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer = new FileWriter("userInfo.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User information saved successfully");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());

        } finally {

            try {
                if (writer != null)
                    writer.close();
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing resources");
            }
        }
    }
}
