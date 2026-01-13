package online_VotingSystem;

public class Voter {
    private int voterId;
    private String name;
    private boolean hasVoted;
    public Voter(int voterId, String name) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = false;
    }
    public int getVoterId() {
        return voterId;
    }
    public boolean hasVoted() {
        return hasVoted;
    }
    public void markVoted() {
        this.hasVoted = true;
    }
    public String getName() {
        return name;
    }
}
