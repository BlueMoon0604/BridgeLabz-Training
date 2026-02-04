import java.time.LocalDate;
import java.util.*;

public class GymMembership {
    public static void main(String[] args) {
        List<String> members = Arrays.asList("aaron,2026-03-12","nova,2026-04-13","kevin,2026-05-16","pop,2026-08-08");
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        System.out.println("membership will be expired in 30 days");

        members.stream().map(m -> m.split(",")).filter(m -> {LocalDate expiry = LocalDate.parse(m[1]); return expiry.isAfter(today) && expiry.isBefore(next30Days);}).forEach(m -> System.out.println(m[0] + ":" + m[1]));
    }
}
