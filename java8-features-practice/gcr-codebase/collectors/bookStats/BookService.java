package bookStats;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {
    public static Map<String, IntSummaryStatistics> getBookStatisticsByGenre(List<Book> books) {
        return books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));
    }
}

