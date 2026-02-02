package collectiontwo;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();  
}
class  Person{
    @JsonField(name = "user_name")
    private String username;
    private String password;

    public Person(String username,String password) {
        this.username = username;
        this.password = password;
    }
}

public class CustomSerialiazation {
    public static void main(String[] args) throws Exception {

        Person p1 = new Person("Panda", "imtsmtiwmttwritm00000");
        String json = toJson(p1);
        System.out.println(json);
    }
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder();
        json.append("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        boolean first = true;
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jf = field.getAnnotation(JsonField.class);

                String key = jf.name();
                Object value = field.get(obj);

                if (!first) {
                    json.append(", ");
                }
                json.append("\"").append(key).append("\": ");
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                first = false;
            }
        }
        json.append("}");
        return json.toString();
    }
}
