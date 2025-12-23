import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI and status
    public static String[] getBMIAndStatus(double weight, double height) {
        double heightM = height / 100.0; 
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; 
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.valueOf(bmi), status};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] result = new String[10][4];

        System.out.println("Enter weight (kg) and height (cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight: ");
            double weight = sc.nextDouble();
            System.out.print("Height: ");
            double height = sc.nextDouble();

            String[] bmiInfo = getBMIAndStatus(weight, height);
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiInfo[0];
            result[i][3] = bmiInfo[1];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + result[i][3]);
        }
    }
}
