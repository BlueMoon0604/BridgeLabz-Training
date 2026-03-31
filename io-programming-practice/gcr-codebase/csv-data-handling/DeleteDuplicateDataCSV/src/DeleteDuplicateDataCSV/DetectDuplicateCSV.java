package DeleteDuplicateDataCSV;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String filePath="student.csv";
        Set<String> seenIds= new HashSet<>();
        boolean isHeader= true;
        try (BufferedReader br= new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line= br.readLine()) != null) {
                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                String[] data= line.split(",");
                String id= data[0];
                // HashSet.add() returns false if ID already exists
                if (!seenIds.add(id)) {
                    System.out.println("Duplicate Record Found:");
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
