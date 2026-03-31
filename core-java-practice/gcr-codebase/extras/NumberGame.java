import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.playGame();
        game.scanner.close();
    }
    
    private void playGame() {
        System.out.println("Think of a number between " + 1 + " and " + 100 + "\nEnter the number");
        scanner.nextLine();
        int attempts = 0;
        int guess = generateFirstGuess();
        
        while (true) {
            attempts++;
            String feedback = getUserFeedback(guess);
            
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yes! Got it in " + attempts + " attempts!");
                break;
            }
            
            guess = generateNextGuess(guess, feedback);
        }
    }
    
    private int generateFirstGuess() {
        return 1 + random.nextInt(100 - 1 + 1);
    }
    
    private String getUserFeedback(int guess) {
        System.out.println("My guess: " + guess);
        System.out.print("Is it (high/low/correct)? ");
        return scanner.nextLine().trim();
    }
    
    private int generateNextGuess(int lastGuess, String feedback) {
        int adjustment = random.nextInt(20) + 5;
        
        if (feedback.equalsIgnoreCase("high")) {
            return Math.max(1, lastGuess - adjustment);
        } else if (feedback.equalsIgnoreCase("low")) {
            return Math.min(100, lastGuess + adjustment);
        }
        
        return lastGuess;
    }
}
