package GenerateJSONRepresentation;
import java.lang.reflect.Field;
public class JsonUtil {
	public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        Class<?> clazz = obj.getClass();

        json.append("{");

        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true); // private fields access

            try {
                json.append("\"")
                    .append(field.getName())
                    .append("\":");

                Object value = field.get(obj);

                // String values ko quotes mein
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                // Last field ke baad comma nahi
                if (i < fields.length - 1) {
                    json.append(",");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        json.append("}");
        return json.toString();
    }
}
