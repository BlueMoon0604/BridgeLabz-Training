package ai_drivenResume;

public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer", 3);
    }
    public boolean matchesSkills(String[] candidateSkills) {
        for (String skill : candidateSkills) {
            if (skill.matches("(?i).*java|python|javascript|c\\+\\+.*")) {
                return true;
            }
        }
        return false;
    }
    public double calculateFitScore(String resumeText) {
        int javaCount = resumeText.toLowerCase().split("java").length;
        int pythonCount = resumeText.toLowerCase().split("python").length;
        return (javaCount * 30 + pythonCount * 20) / 100.0;
    }
}
