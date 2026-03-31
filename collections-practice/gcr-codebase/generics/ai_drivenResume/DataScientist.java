package ai_drivenResume;

public class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist", 4);
    }
    public boolean matchesSkills(String[] candidateSkills) {
        for (String skill : candidateSkills) {
            if (skill.matches("(?i).*python|r|machine learning|tensorflow.*")) {
                return true;
            }
        }
        return false;
    }
    public double calculateFitScore(String resumeText) {
        int pythonCount = resumeText.toLowerCase().split("python").length;
        int mlCount = resumeText.toLowerCase().split("machine learning").length;
        return (pythonCount * 25 + mlCount * 35) / 100.0;
    }
}

