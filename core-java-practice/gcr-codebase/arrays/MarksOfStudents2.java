import java.util.Scanner;

public class  MarksOfStudents2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Create arrays
        int[][] marks = new int[n][3];      
        double[] percentage = new double[n]; 
        String[] grade = new String[n];   
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + ": ");
                marks[i][j] = sc.nextInt();
                // negative marks not allowed
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Try again.");
                    j--; 
                }
            }
            //Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "D";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

    }
}

