class InvalidInvoiceFormatException extends Exception {
    InvalidInvoiceFormatException(String message) {
        super(message);
    }
}
public class ExceptionInvoice {
    static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {
        String[] tasks = input.split(", ");
        for (String task : tasks) {
            if (!task.contains(" - ")) {
                throw new InvalidInvoiceFormatException("Missing ' - ' in: " + task);
            }
        }
        return tasks;
    }
    static double getTotalAmount(String[] tasks) throws InvalidInvoiceFormatException {
        double total = 0;
        for (String task : tasks) {
            String[] parts = task.split(" - ");
            try {
                String priceStr = parts[1].replace(" INR", "");
                total += Double.parseDouble(priceStr);
            } catch (Exception e) {
                throw new InvalidInvoiceFormatException("Invalid amount in: " + task);
            }
        }
        return total;
    }
    public static void main(String[] args) {
        try {
            String invoice1 = "Logo Design - 3000 INR, Web Page - 4500 INR";
            String[] tasks = parseInvoice(invoice1);
            double total = getTotalAmount(tasks);
            System.out.println("Valid - Total: " + total);
            String invoice2 = "Logo Design, Web Page - 4500 INR"; 
            parseInvoice(invoice2);
        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
