import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius= sc.nextDouble();
        double height = sc.nextDouble();
        double vol = Math.PI * radius * radius * height;
        System.out.println("Volume of a cylinder : " + vol);
    }
    
}
