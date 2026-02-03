package validateJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ValidateJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File("students.json");
            Student[] students = mapper.readValue(file, Student[].class);

            for (Student student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
            }

        } catch (Exception e) {
            System.out.println("Invalid JSON structure");
            e.printStackTrace();
        }
    }
}