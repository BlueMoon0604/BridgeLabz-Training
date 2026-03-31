package com.employee.wage;
import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {
    private final String companyName;
    private final int wagePerHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;
    // UC9: Store Total Wage for each Company
    private int totalWage;
    // UC13: Store Daily Wage along with Total Wage
    private final List<Integer> dailyWages;
    public CompanyEmpWage(String companyName, int wagePerHour,int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.dailyWages = new ArrayList<>();
    }
    public String getCompanyName() {
        return companyName;
    }
    public int getWagePerHour() {
        return wagePerHour;
    }
    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }
    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public void addDailyWage(int wage) {
        dailyWages.add(wage);
    }
    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
    public int getTotalWage() {
        return totalWage;
    }
    public List<Integer> getDailyWages() {
        return dailyWages;
    }
    @Override
    public String toString() {
        return "Company: "+companyName+", Total Wage: "+totalWage+", Daily Wages: "+dailyWages;
    }
}

