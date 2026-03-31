package online_VotingSystem;

import java.util.ArrayList;
import java.util.List;
public class ElectionServiceImpl extends ElectionService {
    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();
    
    public void registerVoter(Voter voter) {
        voters.add(voter);
    }
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }
    public void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {
        Voter voter = null;
        Candidate candidate = null;
        for (Voter v : voters) {
            if (v.getVoterId() == voterId) {
                voter = v;
                break;
            }
        }
        for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                candidate = c;
                break;
            }
        }
        if (voter == null || candidate == null) {
            System.out.println("Invalid voter or candidate.");
            return;
        }
        if (voter.hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted!");
        }
        Vote vote = new Vote(voter, candidate);
        vote.cast();
    }
    public void displayResults() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVotes() + " votes");
        }
    }
}
