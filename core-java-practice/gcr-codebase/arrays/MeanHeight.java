import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        // take input
        for(int i = 0 ; i <= heights.length - 1;i++){
            System.out.println("player " + (i + 1) +" height is");
            heights[i] = sc.nextDouble();
        }
        for(int i = 0 ; i <= heights.length - 1;i++){
            sum = heights[i] + sum;
           
        }
        double mean = sum / heights.length ;
        System.out.println("The mean height of football player is : " + mean);
    }   
}
