package online_VotingSystem;

public class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String message) {
        super(message);
    }
}
