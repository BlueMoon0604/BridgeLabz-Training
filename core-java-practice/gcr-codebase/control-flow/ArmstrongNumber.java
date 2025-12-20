import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp  % 10;          
            sum = sum + (digit * digit * digit);
            temp  = temp / 10;     
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
