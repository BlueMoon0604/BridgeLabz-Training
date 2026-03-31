package SearchRecordCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        Scanner sc = new Scanner(System.in);
        boolean isHeader = true;
        boolean found = false;
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data= line.split(",");
                String name= data[1];

                // Case-insensitive search
                if (name.equalsIgnoreCase(searchName)) {

                    String department= data[2];
                    int salary= Integer.parseInt(data[3]);
                    System.out.println("\nEmployee Found!");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + department);
                    System.out.println("Salary     : " + salary);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\nEmployee not found!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
