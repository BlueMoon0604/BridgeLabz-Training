public class Employee {
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee instance.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public static void main(String[] args) {
        displayTotalEmployees(); 
        Employee emp1 = new Employee("Thamarai", "101", "Software Engineer");
        System.out.println();
        emp1.displayEmployeeDetails();
        
        Employee emp2 = new Employee("Rohan", "102", "Project Manager");
        System.out.println();
        emp2.displayEmployeeDetails();
    }
}
