package CreateACustomObjectMapper;

public class User {
	private String name;
    private int age;

    
    public User() {
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
