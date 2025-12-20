import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        String remarks;
        System.out.print("Enter marks in Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks in Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks in Maths: ");
        double maths = sc.nextDouble();
        double total = physics + chemistry + maths;
        double avg = total / 3.0;
        double percent = (total / 300.0) * 100.0;
        if (percent >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percent >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percent >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percent >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percent >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\nTotal Marks   : " + total);
        System.out.println("Average Marks : " + avg);
        System.out.println("Percentage    : " + percent + "%");
        System.out.println("Grade         : " + grade);
        System.out.println("Remarks       : " + remarks);

    }
}
