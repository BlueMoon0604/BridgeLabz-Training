import java.util.Scanner;

public class KiloToMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double mile = km * 1.6;
        System.out.println("The Total miles is " + mile + " mile for the given " + km + " km");

    }
    
}