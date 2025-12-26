import java.util.Scanner;

public class ElectricBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1Votes = 0, candidate2Votes = 0, candidate3Votes = 0;
        int voterCount = 1;

        while (true) {
            System.out.println("Voter " + voterCount + ":");
            System.out.print("Enter your age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid age.");
                sc.nextLine();
                continue;
            }
            int age = sc.nextInt();
            sc.nextLine(); 
            if (age < 18) {
                System.out.println(" you are not eligible to vote.");
                voterCount++;
                continue;
            }
            System.out.print("Vote for candidate (1, 2, or 3): ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter 1, 2, or 3.");
                sc.nextLine();
                continue;
            }
            int vote = sc.nextInt();
            sc.nextLine(); 
            if (vote == 1) {
                candidate1Votes++;
            } else if (vote == 2) {
                candidate2Votes++;
            } else if (vote == 3) {
                candidate3Votes++;
            } else {
                System.out.println("Invalid vote! Please vote for 1, 2, or 3.");
                continue;
            }
            System.out.print("Next voter? (yes to continue, '0' to exit): ");
            String next = sc.nextLine().toLowerCase();
            if (next.equals("0")) {
                break;
            }
            voterCount++;
        }
        System.out.println("Final Results:");
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");
        System.out.println("Candidate 3: " + candidate3Votes + " votes");
    }
}
