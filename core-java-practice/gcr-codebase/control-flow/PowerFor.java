import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int power = scanner.nextInt();
                if (number > 0 && power >= 0) {
                    int result = 1;
                    for (int i = 1; i <= power; i++) {
                        result *= number;
                    }

                    System.out.println(number + " raised to the power " + power + " is: " + result);
                } else {
                    System.out.println("Please enter positive integers (power can be zero).");
                }
            } else {
                System.out.println("Invalid input for power.");
            }
        } else {
            System.out.println("Invalid input for number.");
        }
    }
}

