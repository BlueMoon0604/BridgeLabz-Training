

public class BonusOfEmployees {

    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; 
            data[i][1] = (int) (Math.random() * 15) + 1; 
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus; // new salary
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayResults(double[][] data, double[][] result) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Emp  Old Salary  Years  Bonus  New Salary");
        for (int i = 0; i < 10; i++) {
            double old = data[i][0];
            double years = data[i][1];
            double bonus = result[i][1];
            double newSalary = result[i][0];
            System.out.printf("%-3d  %-10.0f  %-5.0f  %-6.0f  %-10.0f\n", i+1, old, years, bonus, newSalary);
            sumOld += old;
            sumNew += newSalary;
            sumBonus += bonus;
        }

        System.out.printf("Total  %-10.0f  %-5s  %-6.0f  %-10.0f\n", sumOld, "", sumBonus, sumNew);
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData();
        double[][] result = calculateBonusAndNewSalary(data);
        displayResults(data, result);
    }
}
