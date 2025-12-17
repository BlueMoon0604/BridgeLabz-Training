import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int time = sc.nextInt();
        float rate = sc.nextFloat();
        double SI = (principle * rate * time) / 100;
        System.out.println("Simple Interest is : " + SI);
    }
    
}
