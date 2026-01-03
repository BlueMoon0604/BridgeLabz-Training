class Employee {
    protected String name;
    protected int id;
    protected double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}
class Manager extends Employee {
    protected int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails() {
        System.out.println("Manager: " + name + ", ID: " + id + ", Salary: $" + salary + ", Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    protected String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails() {
        System.out.println("Developer: " + name + ", ID: " + id + ", Salary: $" + salary + ", Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    protected int durationMonths;
    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }
    public void displayDetails() {
        System.out.println("Intern: " + name + ", ID: " + id + ", Salary: $" + salary + ", Duration: " + durationMonths + " months");
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 90000, 10),new Developer("Bob", 102, 70000, "Java"), new Intern("Charlie", 103, 30000, 6)};
        for (Employee emp : employees) {
            emp.displayDetails(); 
        }
    }
}

