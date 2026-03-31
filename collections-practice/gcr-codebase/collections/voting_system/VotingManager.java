package voting_system;

import java.util.*;

public class VotingManager {
    private Map<String, CandidateVote> voteMap = new HashMap<>();
    private Map<String, CandidateVote> insertionOrderMap = new LinkedHashMap<>();
    public void castVote(String candidateName) {
        if (voteMap.containsKey(candidateName)) {
            voteMap.get(candidateName).addVote();
        } else {
            CandidateVote vote = new CandidateVote(candidateName, 1);
            voteMap.put(candidateName, vote);
            insertionOrderMap.put(candidateName, vote);
        }
    }
    public void displayInsertionOrder() {
        System.out.println("\nVotes in insertion order:");
        for (CandidateVote vote : insertionOrderMap.values()) {
            System.out.println(vote);
        }
    }
    public void displaySortedResults() {
        TreeMap<String, CandidateVote> sortedMap =
                new TreeMap<>(voteMap);

        System.out.println("\nVotes in sorted order:");
        for (CandidateVote vote : sortedMap.values()) {
            System.out.println(vote);
        }
    }
}
