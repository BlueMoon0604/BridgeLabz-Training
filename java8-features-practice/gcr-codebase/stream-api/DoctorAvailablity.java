import java.util.*;

public class DoctorAvailablity {
    public static void main(String[] args) {
        List<String> doctors = Arrays.asList("David-Cardiology-y","Raven-Neurology-n","Penne-Dermatology-y","Eric-Orthopedic-n");
        doctors.stream().filter(d -> d.endsWith("y")).sorted().forEach(System.out::println);
    }
}
