import java.util.Random;

public class EmployeeWage {
    final static int wagePerHour = 20;
    final static int fullTime = 8;
    final static int partTime = 4;
    final static int workingDaysPerMonth = 20;
    final static int maxHours = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        checkEmployeeAttendance();
        calculateDailyWage();
        calculateDailyWageWithPartTime();
        calculateMonthlyWage();
        calculateWagesTillCondition();
    }
    private static void checkEmployeeAttendance() {
        System.out.println("UC 1 - Check Employee Attendance");
        Random random = new Random();
        boolean isPresent = random.nextBoolean();
        System.out.println("Employee is " + (isPresent ? "Present" : "Absent" ));
    }
    private static void calculateDailyWage() {
        System.out.println("UC 2 - Daily Employee Wage");
        int dailyWage = fullTime * wagePerHour;
        System.out.println("Daily wage for full time : Rs. " + dailyWage);
    }
    private static void calculateDailyWageWithPartTime() {
        System.out.println("UC 3 - Daily Wage with Part Time using Switch Case");
        Random random = new Random();
        int empCheck = random.nextInt(3); 
        int time = 0;
        switch(empCheck) {
            case 1 -> time = fullTime;
            case 2 -> time = partTime;
            default -> time = 0;
        }
        
        int dailyWage = time * wagePerHour;
        String status = empCheck == 0 ? "Absent" : 
                       empCheck == 1 ? "Full Time" : "Part Time";
        System.out.println("Wage for employee including working parttime for " +partTime+ " is Rs." + dailyWage);
    }
    private static void calculateMonthlyWage() {
        System.out.println("UC 4 - Monthly Wages (20 working days)");
        int monthlyWage = workingDaysPerMonth * fullTime * wagePerHour;
        System.out.println("Monthly wage: Rs. " + monthlyWage);
    }
    private static void calculateWagesTillCondition() {
        System.out.println("UC 5 - Wages till 100 hours OR 20 days");
        Random random = new Random();
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;
        while (totalHours <= maxHours && totalDays < workingDaysPerMonth) {
            int empCheck = random.nextInt(3);
            int time = 0;
            switch(empCheck) {
                case 1 -> time = fullTime;
                case 2 -> time = partTime;
            }
            totalHours += time;
            totalDays++;
            totalWage += time * wagePerHour;
        }
        System.out.println("Total Hours working is : " + totalHours);
        System.out.println("Total Days working in a month is : " + totalDays);
        System.out.println("\nTotal Monthly Wage for employee : Rs. " + totalWage);
    }
}
