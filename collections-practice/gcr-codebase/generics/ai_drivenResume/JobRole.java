package ai_drivenResume;

public abstract class JobRole {
    protected String roleName;
    protected int requiredExperience;
    
    public JobRole(String roleName, int requiredExperience) {
        this.roleName = roleName;
        this.requiredExperience = requiredExperience;
    }
    public abstract boolean matchesSkills(String[] candidateSkills);
    public abstract double calculateFitScore(String resumeText);

    public String getRoleName() { return roleName; }
    public int getRequiredExperience() { return requiredExperience; }
}
