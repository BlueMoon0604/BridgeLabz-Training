import java.util.Scanner;

public class FiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input five numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter numbers");
            numbers[i] = sc.nextInt();
        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > 0) {
                if (numbers[j] % 2 == 0) {
                    System.out.println("Even number");
                } else {
                    System.out.println("Odd number");
                }
            } else if (numbers[j] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[4]) {
            System.out.println("Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller");
        }

        sc.close();
    }
}
