class Employee {
    public String employeeID;
    protected String department;
    private double salary;
    
    Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        }
    }
    public void displayEmployeeInfo() {
        System.out.printf("ID: %s, Dept: %s, Salary: ₹%.2f%n", 
                         employeeID, department, salary);
    }
}

class Manager extends Employee {
    private String teamSize;
    
    Manager(String employeeID, String department, double salary, String teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }
    public void updateDepartment(String newDept) {
        this.department = newDept;
    }
    public void displayManagerInfo() {
        System.out.printf("Manager - ID: %s, Dept: %s, Salary: ₹%.2f, Team: %s%n",
                         employeeID, department, getSalary(), teamSize);
    }
    public static void main(String[] args) {
        System.out.println("=== Regular Employee ===");
        Employee emp = new Employee("EMP001", "Software Dev", 45000.0);
        emp.displayEmployeeInfo();
        
        System.out.println("\nSalary update:");
        emp.updateSalary(55000.0);
        System.out.println("Salary: ₹" + emp.getSalary());
        emp.displayEmployeeInfo();
        
        System.out.println("\n=== Manager ===");
        Manager mgr = new Manager("MGR101", "IT Management", 85000.0, "12 members");
        mgr.displayManagerInfo();
        
        System.out.println("\nDepartment update from subclass:");
        mgr.updateDepartment("Senior IT Management");
        mgr.displayManagerInfo();
    }
}


