import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Define an array to store multiplication results
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        //  Display the result 
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
