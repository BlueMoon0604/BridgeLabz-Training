import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D to 1D array 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        System.out.print("1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
