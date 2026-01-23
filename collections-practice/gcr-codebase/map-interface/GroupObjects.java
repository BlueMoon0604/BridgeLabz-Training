package collections;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name, department;
    Employee(String name, String dept) {
        this.name = name;
        this.department = dept;
    }
    public String toString() {
        return name + "(" + department + ")";
    }
    public String getDepartment() {
        return department;
    }
}
public class GroupObjects {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                       .collect(Collectors.groupingBy(Employee::getDepartment));
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Nova", "HR"),
            new Employee("Natasha", "IT"),
            new Employee("Rhysand", "HR")
        );
        System.out.println(groupByDepartment(employees));
    }
}

