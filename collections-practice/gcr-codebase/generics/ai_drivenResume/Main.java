package ai_drivenResume;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ScreeningSystem aiSystem = new ScreeningSystem();
        
        String[] devSkills = {"Java", "Python", "Spring Boot"};
        String devText = "5 years Java development experience with Spring Boot microservices";
        
        String[] dsSkills = {"Python", "Machine Learning", "TensorFlow"};
        String dsText = "Python data analysis, machine learning models with TensorFlow";
        
        Resume<SoftwareEngineer> devResume = aiSystem.processResume(
            "Alice Johnson", devSkills, devText, new SoftwareEngineer());
        Resume<DataScientist> dsResume = aiSystem.processResume(
            "Bob Smith", dsSkills, dsText, new DataScientist());
        
        System.out.println(" Individual Screening ");
        devResume.displayResult();
        dsResume.displayResult();
        
        List<JobRole> pipeline = new ArrayList<>();
        pipeline.add(new SoftwareEngineer());
        pipeline.add(new DataScientist());
        pipeline.add(new ProductManager());
        aiSystem.processPipeline(pipeline);
        
        List<Resume<SoftwareEngineer>> devResumes = new ArrayList<>();
        devResumes.add(devResume);
        System.out.printf("\nDev Team Avg Fit: %.1f%%\n", 
            aiSystem.getAverageFitScore(devResumes));
    }
}
