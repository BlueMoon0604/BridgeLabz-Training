import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println("Please enter a natural number");
            return;
        }
        // Create arrays for odd and even numbers
        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        // Index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
  
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
       
    }
}
