package GenerateJSONRepresentation;

public class Main {
	public static void main(String[] args) {

        User user = new User("Khushi", 21);

        String json = JsonUtil.toJson(user);

        System.out.println(json);
    }
}
