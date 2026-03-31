package cinema_time;

public class Main {
    public static void main(String[] args) {
        CinemaTime cinema = new CinemaTime();
        try {
            cinema.addMovie("Avengers", "18:30");
            cinema.addMovie("Opperhiemer", "15:00");
            cinema.addMovie("Avatar", "25:99");
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All Movies:");
        cinema.displayAllMovies();

        System.out.println("Search Result:");
        cinema.searchMovie("inter");

        System.out.println("Printable Report:");
        String[] report = cinema.generateReport();
        for (String entry : report) {
            System.out.println(entry);
        }
    }
}

