import java.util.Scanner;

public class AgeOfAllTenStudents {

    // Method to generate an array of random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age for " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // To check voting eligibility and return a 2D array of age and boolean
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "false"; // Negative age cannot vote
            } else if (age >= 18) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "true"; // Can vote
            } else {
                result[i][0] = String.valueOf(age);
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // To display the 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nAge\tCan Vote");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStudents = 10;
        // Generate ages for students
        int[] ages = generateAges(numStudents);
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);
        displayTable(eligibility);
    }
}
