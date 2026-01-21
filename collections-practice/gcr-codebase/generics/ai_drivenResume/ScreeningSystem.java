package ai_drivenResume;

import java.util.ArrayList;
import java.util.List;

public class ScreeningSystem {
    public <T extends JobRole> Resume<T> processResume(
            String name, String[] skills, String text, T role) {
        return new Resume<>(name, skills, text, role);
    }
    public void processPipeline(List<? extends JobRole> roles) {
        System.out.println("\n=== Screening Pipeline ===");
        for (JobRole role : roles) {
            System.out.println("- " + role.getRoleName() + " (Req: " + role.getRequiredExperience() + " yrs)");
        }
    }
    public <T extends JobRole> double getAverageFitScore(List<Resume<T>> resumes) {
        double total = 0;
        for (Resume<T> resume : resumes) {
            total += resume.getFitScore();
        }
        return total / resumes.size();
    }
}

