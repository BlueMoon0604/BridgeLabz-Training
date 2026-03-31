package voting_system;

public class Main{
    public static void main(String[] args) {
        VotingManager manager1 = new VotingManager();

        manager1.castVote("Ravvena");
        manager1.castVote("Ellea");
        manager1.castVote("Akshay");
        manager1.castVote("Tarun");
        manager1.castVote("Salman");

        manager1.displayInsertionOrder();
        manager1.displaySortedResults();
    }
}
