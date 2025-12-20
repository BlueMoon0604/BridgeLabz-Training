import java.util.Scanner;

public class GreatestFactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int greatestInteger = 1 ;
        int counter = number - 1;
        while(counter >= 1){
            if( number % counter == 0){
                greatestInteger = counter ;
                break;
            }
            counter-- ;
               
        }
        System.out.println(greatestInteger);
        

    }
    
}
