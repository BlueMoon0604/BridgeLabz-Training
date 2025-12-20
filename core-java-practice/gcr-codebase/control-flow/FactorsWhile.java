import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            System.out.println("Factors of " + n + " are:");
            int i = 1; 
            while (i <= n) {
                if (n % i == 0) {
                    System.out.println(i);
                    }
                    i++; 
                }
        } else {
            System.out.println("Error: Please enter a positive integer.");
        }

        
        

    
    }
}

