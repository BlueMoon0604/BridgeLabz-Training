package ConveryCSVToJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToJavaObjects {

    public static void main(String[] args) {

        String filePath= "student.csv";
        List<Student> students = new ArrayList<>();
        boolean isHeader= true;

        try (BufferedReader br= new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line= br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader= false;
                    continue;
                }

                String[] data= line.split(",");

                int id= Integer.parseInt(data[0]);
                String name= data[1];
                int age= Integer.parseInt(data[2]);
                int marks= Integer.parseInt(data[3]);

                Student student = new Student(id, name, age, marks);
                students.add(student);
            }
            // Print all students
            for (Student s : students) {
                s.display();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
