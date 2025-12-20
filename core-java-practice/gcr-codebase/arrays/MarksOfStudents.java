import java.util.Scanner;

public class MarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        // Create arrays
        int[][] marks = new int[n][3];      
        double[] percentage = new double[n]; 
        String[] grade = new String[n];    
        //Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative");
                i--; 
                continue;
            }
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative");
                i--;
                continue;
            }
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative");
                i--;
                continue;
            }

            // Calculate percentage
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
            System.out.printf("Percentage: ", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }
    }
}

