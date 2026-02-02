package CreateACustomObjectMapper;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Khushi");
        data.put("age", 21);

        User user = ObjectMapperUtil.toObject(User.class, data);

        System.out.println(user);
    }
}
