package salaryCategorization;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Nova", "IT", 98000),
                new Employee("Eric", "HR", 89000),
                new Employee("Aaron", "IT", 80000),
                new Employee("Vm", "Finance", 58000),
                new Employee("Suga", "HR", 89000)
        );
        Map<String, Double> avgSalaryByDept = EmployeeService.calculateAvgSalaryByDept(employees);
        avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " -> " + avgSalary));
    }
}

