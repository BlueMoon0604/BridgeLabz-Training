package orderRevenueSummary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Nova", 9800.50),
                new Order("Nova", 9000.00),
                new Order("Carlos", 1500.99),
                new Order("David", 499.00),
                new Order("Carlos", 120.00)
        );
        Map<String, Double> revenueSummary = OrderService.calculateRevenuePerCustomer(orders);
        revenueSummary.forEach((customer, total) -> System.out.println(customer + ":" + total));
    }
}

