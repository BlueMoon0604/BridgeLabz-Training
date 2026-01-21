package ai_drivenResume;

public class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager", 5);
    }
    public boolean matchesSkills(String[] candidateSkills) {
        for (String skill : candidateSkills) {
            if (skill.matches("(?i).*agile|scrum|product roadmap|stakeholder.*")) {
                return true;
            }
        }
        return false;
    }
    public double calculateFitScore(String resumeText) {
        int agileCount = resumeText.toLowerCase().split("agile").length;
        int scrumCount = resumeText.toLowerCase().split("scrum").length;
        return (agileCount * 30 + scrumCount * 25) / 100.0;
    }
}

