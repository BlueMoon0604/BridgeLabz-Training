import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int peri = 2 * (length * width);
        System.out.println("The perimeter of rectangle is : " + peri);
    }
    
}
