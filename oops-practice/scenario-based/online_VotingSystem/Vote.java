package online_VotingSystem;

public class Vote {
    private Voter voter;
    private Candidate candidate;
    public Vote(Voter voter, Candidate candidate) {
        this.voter = voter;
        this.candidate = candidate;
    }
    public void cast() {
        candidate.addVote();
        voter.markVoted();
    }
}
