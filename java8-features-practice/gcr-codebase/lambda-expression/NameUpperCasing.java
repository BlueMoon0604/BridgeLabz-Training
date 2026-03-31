
import java.util.*;

public class NameUpperCasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nova", "rhysand", "carlos");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

