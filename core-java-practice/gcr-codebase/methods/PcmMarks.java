import java.util.Scanner;

public class PcmMarks {

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static void displayScorecard(int[][] scores, double[][] stats) {
        System.out.println("Roll\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\n", 
                i+1, scores[i][0], scores[i][1], scores[i][2], 
                stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        displayScorecard(scores, stats);


    }
}
