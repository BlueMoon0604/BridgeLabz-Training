public class NullPointer {

    public static void generateException() {
        String text = null;
        System.out.println("Trying to access length of null string");
        int length = text.length();
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Trying to access length of null string with try-catch...");
            int length = text.length(); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }

        // call the method that handles the exception
        System.out.println("\n Handling NullPointerException");
        handleException();
    }
}
