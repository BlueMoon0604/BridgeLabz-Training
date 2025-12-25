import java.util.Scanner;

public class BmiCalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        calculateBMI(data);
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("Member %d: Weight=%.1f kg, Height=%.1f cm, BMI=%.2f, Status=%s%n", 
                i + 1, weight, height, bmi, status);
        }
    }
}
