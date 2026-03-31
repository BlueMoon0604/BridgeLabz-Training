public class SearchAndCheckout {
    static String[] titles = {"Java Programming","Data Structures","Operating Systems","Computer Networks"};
    static String[] authors = {
        "James Gosling",
        "Mark Allen",
        "Abraham Silberschatz",
        "Andrew Tanenbaum"
    };
    static boolean[] isAvailable = {
        true, true, true, true
    };
    static void displayBooks() {
        for (int i = 0; i < titles.length; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " | Author: " + authors[i] +
                " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
            );
        }
    }
    static void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        boolean found = false;
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println((i + 1) + ". " + titles[i] + " | Status: " + (isAvailable[i] ? "Available" : "Checked Out"));
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book have this title");
        }
    }
    static void checkoutBook(int bookNumber) {
        int index = bookNumber - 1;

        if (index >= 0 && index < titles.length) {
            if (isAvailable[index]) {
                isAvailable[index] = false;
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Book is already checked out.");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        displayBooks();
        searchBook("java");
        checkoutBook(1);
        displayBooks();
    }
}
