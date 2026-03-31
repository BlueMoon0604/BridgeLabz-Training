import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Line 1 - x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Line 1 - x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Line 2 - x1 y1: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.print("Line 2 - x2 y2: ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        //length of both lines
        double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double len2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        System.out.printf("\nLine1 Length = %.3f\n", len1);
        System.out.printf("Line2 Length = %.3f\n", len2);

        if (Math.abs(len1 - len2) < 1e-9) {
            System.out.println("Both Lines are equal");
        } else if (len1 < len2) {
            System.out.println("Line1 is shorter than Line2");
        } else {
            System.out.println("Line1 is longer than Line2");
        }

        sc.close();
    }
}
