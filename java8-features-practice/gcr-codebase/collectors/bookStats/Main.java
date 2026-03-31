package bookStats;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Clean Code", "Programming", 464),
                new Book("Effective Java", "Programming", 416),
                new Book("Harry Potter", "Fantasy", 550),
                new Book("The Hobbit", "Fantasy", 310),
                new Book("Atomic Habits", "Self Help", 320)
        );
        Map<String, IntSummaryStatistics> statsByGenre = BookService.getBookStatisticsByGenre(books);
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        });
    }
}

