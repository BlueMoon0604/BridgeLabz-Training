package com.employee.wage;
import java.util.*;

public class EmpBuilder implements EmployeeInterface {
    // UC3: Add Part Time Employee
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    // UC12: Use ArrayList instead of Array
    private final List<CompanyEmpWage> companyList;
    // UC13: Ability to get Total Wage when queried by Company
    private final Map<String, CompanyEmpWage> companyMap;
    public EmpBuilder() {
        companyList=new ArrayList<>();
        companyMap=new HashMap<>();
    }
    // UC8: Compute Employee Wage for Multiple Companies
    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHour,int maxWorkingDays, int maxWorkingHours) {
        CompanyEmpWage company=new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        companyList.add(company);
        companyMap.put(companyName, company);
    }
    @Override
    public void computeEmpWage() {
        // Java 8 Feature: Lambda Expression
        companyList.forEach(this::computeCompanyWage);
    }
    private void computeCompanyWage(CompanyEmpWage company) {
        int totalHours=0;
        int totalDays=0;
        // UC6: Calculate wages till condition (max hours or max days)
        while (totalHours<company.getMaxWorkingHours() &&totalDays<company.getMaxWorkingDays()) {
            totalDays++;
            // UC1: Random Attendance Check
            int empCheck=new Random().nextInt(3);
            int empHours;
            // UC4: Switch Case Statement
            switch (empCheck) {
                // UC2: Full Day = 8 hours
                case IS_FULL_TIME:
                    empHours=8;
                    break;
                // UC3: Part Time = 4 hours
                case IS_PART_TIME:
                    empHours=4;
                    break;
                default:
                    empHours=0; // Absent
            }
            totalHours+=empHours;
            // UC2: Daily Wage Calculation
            int dailyWage=empHours*company.getWagePerHour();
            // UC13: Store Daily Wage
            company.addDailyWage(dailyWage);
        }
        // UC5: Calculating Monthly Wage
        int totalWage=totalHours*company.getWagePerHour();
        // UC9: Save Total Wage for Company
        company.setTotalWage(totalWage);
        System.out.println(company);
    }
    // UC13: Get Total Wage by Company Name
    @Override
    public int getTotalWage(String companyName) {
        // Java 8 Feature: Optional
        return Optional.ofNullable(companyMap.get(companyName)).map(CompanyEmpWage::getTotalWage).orElse(0);
    }
}
