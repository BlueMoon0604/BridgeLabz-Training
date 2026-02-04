import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LoggingTransaction {
	public static void main(String[] args) {
		List<String> ids = Arrays.asList("WXCn10", "ert456", "WE456");
		ids.forEach(id -> System.out.println(LocalDateTime.now() +"Transaction : " +id));
	}

}
