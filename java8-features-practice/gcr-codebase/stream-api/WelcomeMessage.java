import java.util.Arrays;
import java.util.List;

public class WelcomeMessage {
	public static void main(String[] args) {
		List<String> persons = Arrays.asList("Nova", "Madaline", "Tarus", "Aaron");
        persons.forEach(name -> System.out.println("Welcome to the event " + name));
	}

}
