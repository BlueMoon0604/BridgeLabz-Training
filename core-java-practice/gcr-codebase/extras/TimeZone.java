import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
	public static void main(String[] args) {
		DateTimeFormatter dt = DateTimeFormatter.ofPattern(" yyyy-MM-dd HH:mm:ss z");
		
		ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Current time in GMT : " + gmtTime.format(dt));
		
		ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current time in GMT : " + istTime.format(dt));
		
		ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current time in GMT : " + pstTime.format(dt));
		
		
	}

}
