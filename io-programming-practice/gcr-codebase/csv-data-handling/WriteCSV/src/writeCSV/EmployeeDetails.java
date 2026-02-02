package writeCSV;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetails {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("ID,Name,Department,Salary\n");
            writer.append("1,Nova,IT,98000\n");
            writer.append("2,Ellen,HR,89000\n");
            writer.append("3,David,Finance,62000\n");
            writer.append("4,Leo,Marketing,50000\n");
            writer.append("5,Eric,Sales,34000\n");
            System.out.println("CSV file created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }
    }
}
