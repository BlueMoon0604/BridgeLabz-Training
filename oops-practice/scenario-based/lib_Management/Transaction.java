package lib_Management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Transaction {
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;
    public Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
    }
    public double returnBook() {
        this.returnDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(issueDate, returnDate);
        int lateDays = (int) Math.max(0, days - 7); 
        return member.calculateFine(lateDays);
    }
}
