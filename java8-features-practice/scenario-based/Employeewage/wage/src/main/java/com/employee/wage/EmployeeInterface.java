package com.employee.wage;

//UC11: Manage Employee Wage using Interface approach
public interface EmployeeInterface{
 void addCompanyEmpWage(String companyName, int wagePerHour,int maxWorkingDays, int maxWorkingHours);
 void computeEmpWage();
 int getTotalWage(String companyName);
}

