import java.util.Scanner;

public class MultidimensionalArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        //Create 2D array 
        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        // Input weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input weight with validation
            double w;
            do {
                System.out.print("Enter weight (kg): ");
                w = sc.nextDouble();
                if (w <= 0) {
                    System.out.println("Weight must be positive");
                }
            } while (w <= 0);

            // Input height with validation
            double h;
            do {
                System.out.print("Enter height (m): ");
                h = sc.nextDouble();
                if (h <= 0) {
                    System.out.println("Height must be positive");
                }
            } while (h <= 0);
            personData[i][0] = w;
            personData[i][1] = h;
            // Calculate BMI
            double bmi = w / (h * h);
            personData[i][2] = bmi;

            // Determine status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.printf("BMI:", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            
        }

        
    }
}

