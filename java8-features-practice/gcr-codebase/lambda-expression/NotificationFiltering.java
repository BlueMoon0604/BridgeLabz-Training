import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {
	public static void main(String[] args) {
		List<String> alerts = Arrays.asList("Critical : oxygen level low", "Normal : recovering ", "Reminder : take medicine on time", "Critical : bp is low");
        Predicate<String> onlyCritical = a -> a.startsWith("Critical");
        for (String alert : alerts) {
            if (onlyCritical.test(alert)) {
                System.out.println(alert);
            }
        }
		
	}

}
