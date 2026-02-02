package countRows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {
        String filePath = "EmployeesData.csv";
        String line;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) { 
                    count++;
                }
            }
            System.out.println("Total Employee Records: " + count);

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}
