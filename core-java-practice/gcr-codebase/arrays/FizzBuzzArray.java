import java.util.Scanner;

public class FizzBuzzArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        // Create a String array to store results
        String[] res = new String[num];
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                res[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                res[i - 1] = "Buzz";
            } else {
                res[i - 1] = String.valueOf(i);
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + res[i]);
        }
    }
}
