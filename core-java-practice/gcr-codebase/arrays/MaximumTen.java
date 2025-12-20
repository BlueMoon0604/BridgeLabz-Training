import java.util.Scanner;

public class MaximumTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Iniliazing array
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        // Infinite loop 
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("You have reached the maximum of 10 numbers.");
                break;
            }
            // Store the number in the array and increamenting index
            numbers[index] = num;
            index++;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Sum of all numbers: " + total);
    }
}
