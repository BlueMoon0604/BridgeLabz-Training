import java.util.*;
import java.util.stream.*;

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<String> claims = Arrays.asList("Health,80000","Vehicle,75000","Health,80000","Vehicle,980000","Travel,30000");
        Map<String, Double> avg = claims.stream().map(c -> c.split(",")).collect(Collectors.groupingBy(c -> c[0],Collectors.averagingDouble(c -> Double.parseDouble(c[1]))));

        avg.forEach((key, value) -> System.out.println(key+" Average : "+value));
    }
}

