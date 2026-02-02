package collectiontwo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
	int value();
}
class User{
	@MaxLength(10)
	private String username;
	public User (String username) {
		this.username = username;
		validateFields();
	}
	private void validateFields() {
        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {

                MaxLength max = field.getAnnotation(MaxLength.class);
                int limit = max.value();

                if (username != null && username.length() > limit) {
                    throw new IllegalArgumentException("length of username exceeds limit of " + limit);
                }
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

public class LengthOfString {
	public static void main(String[] args) {
		User u1 = new User("Nova");
		System.out.println(u1.getUsername());
		
		User u2 = new User("Welllonvinausername");
		System.out.println(u2.getUsername());
	}

}
