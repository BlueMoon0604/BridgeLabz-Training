import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageAmar = scanner.nextInt();
        int ageAkbar = scanner.nextInt();
        int ageAnthony = scanner.nextInt();
        float heightAmar = scanner.nextFloat();
        float heightAkbar = scanner.nextFloat();
        float heightAnthony = scanner.nextFloat();
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("The youngest friend is Amar with age " + ageAmar);
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("The youngest friend is Akbar with age " + ageAkbar);
        } else {
            System.out.println("The youngest friend is Anthony with age " + ageAnthony);
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("The tallest friend is Amar with height " + heightAmar + " cm");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("The tallest friend is Akbar with height " + heightAkbar + " cm");
        } else {
            System.out.println("The tallest friend is Anthony with height " + heightAnthony + " cm");
        }

    }
}

