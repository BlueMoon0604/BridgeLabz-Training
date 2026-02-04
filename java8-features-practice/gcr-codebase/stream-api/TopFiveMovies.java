import java.util.*;

public class TopFiveMovies {
    public static void main(String[] args) {
        Map<String, Double> movies = new HashMap<>();

        movies.put("Avengers", 5.0);
        movies.put("Titanic", 3.5);
        movies.put("dhurander",4.0);
        movies.put("PK", 3.9);
        movies.put("Passengers", 3.9);
        movies.put("Zootopia", 4.8);
        System.out.println("Top five movies are");

        movies.entrySet().stream().sorted((a, b) -> Double.compare(b.getValue(), a.getValue())).limit(5).forEach(m -> System.out.println(m.getKey() + ":" + m.getValue()));
    }
}

