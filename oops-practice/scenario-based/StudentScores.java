import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        double[] scores = new double[n];
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i+1) + ": ");
            String input = sc.nextLine().trim();
            if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Invalid number format.");
                return;
            }
            double score = Double.parseDouble(input);
            if (score < 0) {
                System.out.println("Negative score . input again");
                return;
            }
            scores[i] = score;
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }
        double avg = sum / n;
        System.out.printf("Average: %.2f%n", avg);
        System.out.printf("Highest: %.2f%n", max);
        System.out.printf("Lowest: %.2f%n", min);
        System.out.print("Above average: ");
        for (double s : scores) {
            if (s > avg) {
                System.out.printf("%.2f ", s);
            }
        }
        System.out.println();
        sc.close();
    }
}
