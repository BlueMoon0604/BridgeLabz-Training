import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        int stopNum = 1;

        while (true) {
            int distanceToNextStop = 5; //Assumed
            totalDistance += distanceToNextStop;
            System.out.println("Stop " + stopNum + ": Distance traveled so far: " + totalDistance + " km");
            System.out.print("Do you want to get off at this stop? : ");
            String getOff = sc.nextLine().trim().toLowerCase();
            if (getOff.equals("yes")) {
                System.out.println("Passenger gets off at stop " + stopNum + ". Total distance: " + totalDistance + " km");
                break;
            } else {
                stopNum++;
            }
        }
    }
}
