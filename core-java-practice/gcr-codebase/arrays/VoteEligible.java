import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        // Take input for ages
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter age for student " + (i + 1));
            age[i] = sc.nextInt();
        }
        for (int j = 0; j < age.length; j++) {
            if (age[j] < 0) {
                System.out.println("Invalid age for student " + (j + 1));
            } else if (age[j] >= 18) {
                System.out.println("The student " + (j + 1) + " with the age " + age[j] + " can vote");
            } else {
                System.out.println("The student " + (j + 1) + " with the age " + age[j] + " cannot vote");
            }
        }
    }
}


