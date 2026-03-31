import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // To create and initialize the deck
    public static String[] createDeck() {
        int totalCards = suits.length * ranks.length;
        String[] deck = new String[totalCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randIndex = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randIndex];
            deck[randIndex] = temp;
        }
        return deck;
    }
    // method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int players) {
        int totalCards = deck.length;
        if (totalCards % players != 0) {
            System.out.println("Cards can't be evenly distributed among players.");
            return null;
        }
        int cardsPerPlayer = totalCards / players;
        String[][] playersCards = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }
        return playersCards;
    }


    public static void printPlayersCards(String[][] playersCards) {
        if (playersCards == null) return;
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playersCards[i]) {
                System.out.println("\t" + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = createDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        String[][] playersCards = distributeCards(deck, players);

        printPlayersCards(playersCards);
        sc.close();
    }
}
