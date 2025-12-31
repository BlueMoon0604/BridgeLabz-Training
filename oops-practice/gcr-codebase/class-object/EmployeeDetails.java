
public class EmployeeDetails {
	String name ;
	int Id;
	int salary;
	public void displayDetails() {
		System.out.println("Employee Name is : " + name);
		System.out.println("Employee Id is : " + Id);
		System.out.println("Employee Salary is : " + salary);
		
	}
	
	public static void main(String[] args ) {
		EmployeeDetails employee = new EmployeeDetails();
		employee.name = "Rohan";
		employee.Id = 1 ;
		employee.salary = 500000;
		employee.displayDetails();
	
	}

}
