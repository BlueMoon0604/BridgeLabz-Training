import java.util.Random;

public class MatrixManipulation2 {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = matrix[1][1] / det;
        inv[0][1] = -matrix[0][1] / det;
        inv[1][0] = -matrix[1][0] / det;
        inv[1][1] = matrix[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
        inv[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / det;
        inv[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
        inv[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / det;
        inv[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
        inv[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / det;
        inv[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
        inv[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / det;
        inv[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
        return inv;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix2x2));
        System.out.println("Determinant: " + determinant2x2(matrix2x2));
        System.out.println("Inverse:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) displayMatrix(inv2x2);

        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);
        System.out.println("Transpose:");
        displayMatrix(transposeMatrix(matrix3x3));
        System.out.println("Determinant: " + determinant3x3(matrix3x3));
        System.out.println("Inverse:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) displayMatrix(inv3x3);
    }
}
