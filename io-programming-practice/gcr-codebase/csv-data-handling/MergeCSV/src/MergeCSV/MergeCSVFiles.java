package MergeCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {
        String file1 = "student1.csv";
        String file2 = "student2.csv";
        String outputFile = "merged_students.csv";
        // Map<ID, "Marks,Grade">
        Map<String, String> marksMap = new HashMap<>();
        boolean isHeader= true;
        // Read students2.csv and store Marks & Grade by ID
        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {

            String line;
            isHeader= true;

            while ((line= br2.readLine()) != null) {
                if (isHeader) {
                    isHeader= false;
                    continue;
                }
                String[] data= line.split(",");
                String id= data[0];
                String marksGrade= data[1]+","+data[2];
                marksMap.put(id, marksGrade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Read students1.csv and merge with data from map
        try (
            BufferedReader br1= new BufferedReader(new FileReader(file1));
            BufferedWriter bw= new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            isHeader = true;
            // Write header for merged file
            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            while ((line = br1.readLine()) != null) {

                if (isHeader) {
                    isHeader= false;
                    continue;
                }
                String[] data= line.split(",");
                String id= data[0];
                String name= data[1];
                String age= data[2];

                // Fetch Marks & Grade using ID
                String marksGrade = marksMap.get(id);
                if (marksGrade != null) {
                    bw.write(id + "," + name + "," + age + "," + marksGrade);
                    bw.newLine();
                }
            }

            System.out.println("CSV files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
