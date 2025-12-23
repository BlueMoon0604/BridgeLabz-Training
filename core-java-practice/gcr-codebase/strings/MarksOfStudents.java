import java.util.Scanner;

public class MarksOfStudents {

    // To generate random 2-digit scores for PCM for n students
    public static int[][] generatePCM(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100); 
            }
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] pcm) {
        int n = pcm.length;
        double[][] stats = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = (double) total / 3;
            double percent = (double) total / 300 * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0; 
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // To calculate grade based on percentage
    public static String[][] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[][] grades = new String[n][1];

        for (int i = 0; i < n; i++) {
            double percentage = stats[i][2];
            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else {
                grades[i][0] = "F";
            }
        }
        return grades;
    }

    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] pcm, double[][] stats, String[][] grades) {
        System.out.println("\nScorecard");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("S%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t\t%s%n",
                i + 1,
                pcm[i][0], pcm[i][1], pcm[i][2],
                stats[i][0], stats[i][1], stats[i][2],
                grades[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        // CalculatePCM scores
        int[][] pcm = generatePCM(numStudents);
        // Calculate stats
        double[][] stats = calculateStats(pcm);
        // Calculate grades
        String[][] grades = calculateGrades(stats);
        displayScorecard(pcm, stats, grades);
    }
}
