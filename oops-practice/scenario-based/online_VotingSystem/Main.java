package online_VotingSystem;

public class Main {
    public static void main(String[] args) {
        ElectionService election = new ElectionServiceImpl();
        election.registerVoter(new Voter(1, "Nova"));
        election.registerVoter(new Voter(2, "Yuvi"));
        
        election.addCandidate(new Candidate(101, "Candidate A"));
        election.addCandidate(new Candidate(102, "Candidate B"));
        try {
            election.castVote(1, 101);
            election.castVote(2, 102);
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
        election.displayResults();
    }
}

