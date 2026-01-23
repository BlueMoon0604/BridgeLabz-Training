package voting_system;

public class CandidateVote {
    private String candidateName;
    private int votes;

    public CandidateVote(String candidateName, int votes) {
        this.candidateName = candidateName;
        this.votes = votes;
    }
    public String getCandidateName() {
        return candidateName;
    }
    public int getVotes() {
        return votes;
    }
    public void addVote() {
        votes++;
    }
    public String toString() {
        return candidateName + " -> " + votes + " votes";
    }
}

