package collections;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size");
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            System.out.print("Enter index");
            int index = sc.nextInt();
            
            if (arr[index] != 0) {
                System.out.println("Value at index " + index + ": " + arr[index]);
            } else {
                System.out.println("Value at index " + index + ": 0");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid integers");
        } finally {
            sc.close();
        }
    }
}
