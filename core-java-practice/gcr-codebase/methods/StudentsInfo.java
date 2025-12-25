import java.util.Scanner;

public class StudentsInfo {
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }
        return youngest;
    }
    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        int youngestAge = findYoungest(ages);
        double tallestHeight = findTallest(heights);
        System.out.println("The youngest friend has age: " + youngestAge);
        System.out.println("The tallest friend has height: " + tallestHeight);

    }
}
