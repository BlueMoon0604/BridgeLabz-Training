import java.util.Scanner;

public class MayaFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input from clients 
        System.out.println("Enter your Height ");
        double height = sc.nextDouble();
        System.out.println("Enter your Weight ");
        double weight = sc.nextDouble();
        // Calculating BMI 
        double bmi = weight / (height * height);
        System.out.println("your BMI is : " + bmi);
        // print category 
        if(bmi < 18.5){
            System.out.println(" Category : Underweight");
        }else if(bmi >= 18.5 || bmi <= 24.9){
            System.out.println("Ctaegory : Normal");
        }else{
            System.out.println("Category : Overweight");
        }



        
    }
    
}
