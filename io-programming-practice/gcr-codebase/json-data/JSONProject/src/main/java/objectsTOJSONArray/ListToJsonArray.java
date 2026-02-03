package objectsTOJSONArray;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {

    public static void main(String[] args) {
        try {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Susanne", 21, "sus@gmail.com"));
            students.add(new Student("Aaron", 22, "aaron@gmail.com"));
            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
