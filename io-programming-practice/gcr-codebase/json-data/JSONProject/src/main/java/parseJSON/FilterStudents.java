package parseJSON;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudents {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Student> students = mapper.readValue(
                    new File("students.json"),
                    new TypeReference<List<Student>>() {}
            );

            List<Student> filtered = students.stream()
                    .filter(s -> s.getAge() > 25)
                    .collect(Collectors.toList());
            String jsonResult = mapper.writerWithDefaultPrettyPrinter()
                                      .writeValueAsString(filtered);

            System.out.println(jsonResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
