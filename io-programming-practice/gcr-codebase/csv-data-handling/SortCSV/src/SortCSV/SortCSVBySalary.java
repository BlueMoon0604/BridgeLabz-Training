package SortCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;
    int salary;

    Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SortCSVBySalary {

    public static void main(String[] args) {

        String filePath = "employees.csv";
        List<Employee> employees = new ArrayList<>();
        boolean isHeader = true;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data= line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                String department=data[2];
                int salary=Integer.parseInt(data[3]);

                employees.add(new Employee(id, name, department, salary));
            }
            // Sort by salary in descending order
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return Integer.compare(e2.salary, e1.salary);
                }
            });
            System.out.println("Top 5 Highest Paid Employees:\n");
            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                Employee e=employees.get(i);
                System.out.println("Name       : " + e.name);
                System.out.println("Department : " + e.department);
                System.out.println("Salary     : " + e.salary);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
