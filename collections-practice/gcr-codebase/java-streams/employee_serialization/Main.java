package employee_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "employees.dat";
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Nova", "IT", 50000));
        employees.add(new Employee(102, "Josep", "HR", 45000));
        employees.add(new Employee(103, "Hyun-Seok", "Finance", 55000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees saved successfully!");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> empList =
                    (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved Employees:");

            for (Employee emp : empList) {
                System.out.println(emp);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
