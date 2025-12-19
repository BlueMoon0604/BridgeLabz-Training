import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int year = sc.nextInt();
        if(year > 5 ){
            double bonusAmount = salary * 0.05;
            System.out.println(bonusAmount);
        }
        
    }
    
}
