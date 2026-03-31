import java.util.Arrays;

public class InvoiceGenerator {
    
    static String[] parseInvoice(String str) {
        return str.split(", ");  
    }
    static double getTotalAmount(String[] tasks) {
        double t = 0; 
        for(String task : tasks) {
            String[] parts = task.split(" - "); 
            double amt = Double.parseDouble(parts[1].replace(" INR", ""));
            t += amt;
        }
        return t;
    }
    public static void main(String[] args) {
        String invoice = "Logo Design - 3000 INR, Web Page - 4500 INR";
        String[] tasks = parseInvoice(invoice);
        System.out.println("Tasks : " + Arrays.toString(tasks)); 
        double total = getTotalAmount(tasks);
        System.out.println("Total Amount : Rs. " + total);
    }
}

