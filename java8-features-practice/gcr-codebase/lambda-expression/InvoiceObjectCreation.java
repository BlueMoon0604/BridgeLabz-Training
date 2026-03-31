
import java.util.*;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }
}
public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<Integer> Ids = Arrays.asList(1203, 560, 561, 34);
        Ids.stream().map(Invoice::new).forEach(i -> System.out.println(i.transactionId));
    }
}

