import java.util.Scanner;

public class TotalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0.0;
        double OldSalary = 0.0;
        double NewSalary = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Get salary (must be positive)
            while (true) {
                System.out.print("Salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] > 0) {
                    break;
                } else {
                    System.out.println("Invalid salary");
                }
            }

            // Get years of service
            while (true) {
                System.out.print("Years of service: ");
                years[i] = sc.nextInt();
                if (years[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid years");
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            OldSalary += salary[i];
            NewSalary += newSalary[i];
        }
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + OldSalary);
        System.out.println("Total new salary: " + NewSalary);
    }
}
