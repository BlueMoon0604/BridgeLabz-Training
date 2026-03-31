import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visitor = 1;

        while (true) {
            System.out.print("Visitor " + visitor + " : enter your lucky number: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine(); 
                continue;
            }

            int num = sc.nextInt();
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("You win a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
            System.out.print("Another visitor? : ");
            String next = sc.nextLine().toLowerCase();
            if (next.equals("no")) {
                break;
            }
            visitor++;
        }
    }
}
