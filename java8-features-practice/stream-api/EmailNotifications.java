import java.util.Arrays;
import java.util.List;

public class EmailNotifications {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList("raven@gmail.com","eric@gmail.com", "traus123@gmail.com");
		emails.forEach(email -> System.out.println("Notification sent to "+ email));
	}

}
