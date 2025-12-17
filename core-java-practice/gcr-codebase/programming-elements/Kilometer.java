import java.util.Scanner;

public class Kilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilo = sc.nextInt();
        double mil = kilo * 0.621371;
        System.out.println("The distance in miles is : " + mil + " miles " );

    }
    
}
