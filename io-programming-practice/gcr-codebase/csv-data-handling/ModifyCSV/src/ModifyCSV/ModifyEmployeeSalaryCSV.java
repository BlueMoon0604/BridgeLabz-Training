package ModifyCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyEmployeeSalaryCSV {
    public static void main(String[] args) {
        String inputFile="employees.csv";
        String outputFile="updated_employees.csv";
        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            boolean isHeader = true;
            while ((line = br.readLine()) != null) {
                // Write header as it is
                if (isHeader) {
                    bw.write(line);
                    bw.newLine();
                    isHeader = false;
                    continue;
                }
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);
                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }
                bw.write(id + "," + name + "," + department + "," + (int) salary);
                bw.newLine();
            }
            System.out.println("Updated CSV file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
