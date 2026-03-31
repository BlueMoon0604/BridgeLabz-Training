import java.util.Arrays;

public class PalindromeOrDuck {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int n = countDigits(number);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - i - 1];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversed));
        boolean arraysEqual = areArraysEqual(digits, reversed);
        System.out.println("Digits and reversed digits equal: " + arraysEqual);
        boolean palindrome = isPalindrome(number);
        System.out.println("Is Palindrome: " + palindrome);
        boolean duck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + duck);
    }
}
