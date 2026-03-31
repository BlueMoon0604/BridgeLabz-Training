package lib_Management;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService(); 
        library.addBook(new Book(1, "Atomic Habits", "James Clear"));
        library.addBook(new Book(2, "Magic Notebook", "Saanvi"));
        Member student = new Student(101, "Nova");
        Member staff = new Staff(201, "Raven");
        library.registerMember(student);
        library.registerMember(staff);
        library.displayBooks();
        library.displayMembers();
        try {
            Transaction t1 = library.issueBook(1, student);
            double fine = t1.returnBook();
            System.out.println("Fine charged: Rs. " + fine);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
