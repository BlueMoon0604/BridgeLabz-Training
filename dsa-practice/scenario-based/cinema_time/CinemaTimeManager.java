package cinema_time;

import java.util.ArrayList;
import java.util.List;

class CinemaTime {
    private final List<String> movieTitles = new ArrayList<>();
    private final List<String> showTimes = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid showtime format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
    }
    public void searchMovie(String keyword) {
        boolean found = false;
        for (int i = 0; i < movieTitles.size(); i++) {
            try {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(String.format("Found: %s at %s",movieTitles.get(i), showTimes.get(i)));
                    found = true;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Data mismatch while searching movie list");
            }
        }
        if (!found) {
            System.out.println("No movies found with keyword: " + keyword);
        }
    }
    public void displayAllMovies() {
        if (movieTitles.isEmpty()) {
            System.out.println("No movies scheduled.");
            return;
        }
        for (int i = 0; i < movieTitles.size(); i++) {
            System.out.println(String.format("%d. %s - %s",i + 1, movieTitles.get(i), showTimes.get(i)));
        }
    }
    public String[] generateReport() {
        String[] report = new String[movieTitles.size()];

        for (int i = 0; i < movieTitles.size(); i++) {
            report[i] = movieTitles.get(i) + " @ " + showTimes.get(i);
        }
        return report;
    }
    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) {
        	return false;
        }
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}

