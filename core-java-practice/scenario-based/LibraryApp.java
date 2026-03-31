import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fine = 5;
        for (int bookCount = 1; bookCount <= 5; bookCount++) {
            System.out.println("\nChecking Book " + bookCount);
            System.out.print("Due day: ");
            int dueDate = sc.nextInt();
            System.out.print("Returned day: ");
            int returnedDate = sc.nextInt();
            if (returnedDate > dueDate) {
                int extraDays = returnedDate - dueDate;
                int totalFine = extraDays * fine;
                System.out.println("Returned late by " + extraDays + " days");
                System.out.println("Fine to be paid : " + totalFine);
            } else {
                System.out.println("Good . You returned book on time");
            }
        }

        sc.close();
    }
}
