import java.util.Scanner;

public class AthleteRuns {
    public static int computeRounds(double sideOneInMeters, double sideTwoInMeters, double sideThreeInMeters) {
        double perimeter = sideOneInMeters + sideTwoInMeters + sideThreeInMeters;
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        return (int) Math.ceil(rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of three sides");
        double sideOneInMeters = sc.nextDouble();
        double sideTwoInMeters = sc.nextDouble();
        double sideThreeInMeters = sc.nextDouble();
        int rounds = computeRounds(sideOneInMeters, sideTwoInMeters, sideThreeInMeters);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    
    }
}
