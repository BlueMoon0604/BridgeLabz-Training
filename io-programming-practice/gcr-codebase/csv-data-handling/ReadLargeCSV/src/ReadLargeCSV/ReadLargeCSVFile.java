package ReadLargeCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeCSVFile{

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "large_data.csv";
        int totalRecords = 0;
        int currentChunkCount = 0;
        boolean isHeader = true;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                // Process one record (dummy processing here)
                currentChunkCount++;
                totalRecords++;

                // When 100 lines are processed
                if (currentChunkCount == CHUNK_SIZE) {
                    System.out.println("Processed records: " + totalRecords);
                    currentChunkCount = 0; // reset for next chunk
                }
            }

            // Handle remaining records (< 100)
            if (currentChunkCount > 0) {
                System.out.println("Processed records: " + totalRecords);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
