package objectsToJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {
    public static void main(String[] args) {
        try {
            Car car = new Car("Hyundai", "i10", 2023);
            ObjectMapper mapper = new ObjectMapper();

            // Convert Java Object to JSON String
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
