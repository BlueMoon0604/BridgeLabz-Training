import java.util.Scanner;

public class BmiCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double heightMeter = height / 100.0;
        double bmi = weight / (heightMeter * heightMeter);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("Your BMI is: "+ bmi);
        System.out.println("Weight status: " + status);

    }
}
