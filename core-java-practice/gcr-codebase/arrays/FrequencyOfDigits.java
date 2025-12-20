import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //Count digits and store in an array
        int temp = number;
        int count = 0;
        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }
        int[] frequency = new int[10]; 
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        
    }
}
