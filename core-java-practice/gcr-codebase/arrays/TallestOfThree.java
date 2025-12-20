import java.util.Scanner;

public class TallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }
        int yIndex = 0;
        int tIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[yIndex]) {
                yIndex = i;
            }
            if (heights[i] > heights[tIndex]) {
                tIndex = i;
            }
        }
        System.out.println("\nYoungest friend: " + names[yIndex]);
        System.out.println("Tallest friend: " + names[tIndex]);
    }
}
