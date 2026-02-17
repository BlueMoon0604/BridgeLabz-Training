package com.employee.wage;
public class Main {

    public static void main(String[] args) {
        // Welcome Message (Master Branch)
        System.out.println("Welcome to Employee Wage Computation Program");
        // UC10: One Builder manages multiple companies
        EmployeeInterface empWageBuilder = new EmpBuilder();
        // UC8: Each company has its own wage, days, hours
        empWageBuilder.addCompanyEmpWage("Google", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Apple", 28, 20, 110);
        empWageBuilder.addCompanyEmpWage("Amazon", 26, 22, 115);
        empWageBuilder.computeEmpWage();
        System.out.println("Total Wage for Google : "+ empWageBuilder.getTotalWage("Capgemini"));
    }
}
