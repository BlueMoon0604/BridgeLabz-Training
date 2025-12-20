import java.util.Scanner;

public class ArrayMultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for(int i = 6 ; i <= 9;i++){
            multiplicationResult[i - 6 ] = num * i;

        }
        System.out.println("Multiplication table from 6 to 9");
        for(int i = 6 ; i <=9 ; i++){
            System.out.println(num + " * " + i + " = " + multiplicationResult[i - 6]);
        }

    }
    
}
