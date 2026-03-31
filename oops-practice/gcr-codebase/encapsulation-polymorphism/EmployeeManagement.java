interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: $" + calculateSalary());
    }
    public String getName() {
    	return name; 
    	
    }
    public void setName(String name) {
    	this.name = name; 
    	
    }
    public double getBaseSalary() {
    	return baseSalary; 
    }
    public void setBaseSalary(double baseSalary) {
    	this.baseSalary = baseSalary; 
    }
}
class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String dept) {
        this.department = dept;
    }
    public String getDepartmentDetails() {
        return department != null ? department : "Not assigned";
    }
}
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String employeeId, String name, int hoursWorked, double hourlyRate) {
        super(employeeId, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    public void assignDepartment(String dept) {
        System.out.println(getName() + " assigned to " + dept);
    }
    public String getDepartmentDetails() {
        return "Part-time role";
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = { new FullTimeEmployee("E001", "Alice", 50000), new PartTimeEmployee("E002", "Bob", 40, 25.0)};
        System.out.println("Employee Details:");
        for (Employee e : employees) {
            e.displayDetails();
        }
        ((FullTimeEmployee)employees[0]).assignDepartment("IT");
        System.out.println("Dept: " + ((FullTimeEmployee)employees[0]).getDepartmentDetails());
    }
}
