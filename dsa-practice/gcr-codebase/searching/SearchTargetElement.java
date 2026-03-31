package default_package;

public class SearchTargetElement {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
        	return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;
            
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Target 3: " + searchMatrix(matrix1, 3));
        System.out.println("Target 13: " + searchMatrix(matrix1, 13));
        
        int[][] matrix2 = {{1}};
        System.out.println("\nMatrix 2: [[1]]");
        System.out.println("Target 1: " + searchMatrix(matrix2, 1));
    }
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
        System.out.println();
    }
}

