package ai_drivenResume;

public class Resume<T extends JobRole> {
    private String candidateName;
    private String[] skills;
    private String fullText;
    private T targetRole;
    
    public Resume(String candidateName, String[] skills, String fullText, T targetRole) {
        this.candidateName = candidateName;
        this.skills = skills;
        this.fullText = fullText;
        this.targetRole = targetRole;
    }
    public boolean screenCandidate() {
        return targetRole.matchesSkills(skills);
    }
    public double getFitScore() {
        return targetRole.calculateFitScore(fullText);
    }
    public void displayResult() {
        System.out.printf("%s -> %s: %.1f%% fit (Screened: %s)\n",
            candidateName, targetRole.getRoleName(),
            getFitScore(), screenCandidate() ? "PASS" : "FAIL");
    }
    
    public T getTargetRole() { return targetRole; }
}
