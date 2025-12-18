import java.util.Scanner;

public class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 2.54 * 2.54;
        System.out.println(
            "The base is " + base + " inches and height is " + height + " inches\n" +
            "The area of the triangle is " + areaInInches + " square inches\n" +
            "Which is equal to " + areaInCm + " square centimeters"
        );

    }
}
