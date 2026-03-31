package ValidateCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidateCSVData {

    // Regex for email validation
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Regex for 10-digit phone number
    private static final String PHONE_REGEX =
            "\\d{10}";

    public static void main(String[] args) {

        String filePath = "users.csv";
        boolean isHeader = true;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean validEmail = email.matches(EMAIL_REGEX);
                boolean validPhone = phone.matches(PHONE_REGEX);

                if (!validEmail || !validPhone) {

                    System.out.println("Invalid Record Found:");
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);

                    if (!validEmail) {
                        System.out.println("Error : Invalid Email Format");
                    }

                    if (!validPhone) {
                        System.out.println("Error : Phone number must be 10 digits");
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
