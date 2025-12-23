import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer's choice
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        switch (rand) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    // Method to find the winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("paper") && computer.equals("rock")) ||
                   (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate average and percentage wins
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userAvg = (double) userWins / totalGames;
        double computerAvg = (double) computerWins / totalGames;
        double userPercent = userAvg * 100;
        double computerPercent = computerAvg * 100;

        return new String[][]{
            {"Player", String.valueOf(userWins), String.format("%.2f", userAvg), String.format("%.2f", userPercent)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerAvg), String.format("%.2f", computerPercent)}
        };
    }

    // Method to display game results and stats
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tAverage\tPercentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int numGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[numGames][3];
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, numGames);
        displayResults(gameResults, stats);
    }
}
