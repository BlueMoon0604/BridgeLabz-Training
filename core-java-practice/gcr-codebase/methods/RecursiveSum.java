import java.util.Scanner;

public class RecursiveSum {
    public static int sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumRecursive(n - 1);
        }
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumForm);

            if (sumRec == sumForm) {
                System.out.println("Both methods give the same result. Correct!");
            } else {
                System.out.println("Results do not match. There is an error.");
            }
        }
    }
}
