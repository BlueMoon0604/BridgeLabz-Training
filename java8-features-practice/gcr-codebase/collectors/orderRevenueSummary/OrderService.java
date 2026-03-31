package orderRevenueSummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderService {
    public static Map<String, Double> calculateRevenuePerCustomer(List<Order> orders) {
        return orders.stream().collect(Collectors.groupingBy(Order::getCustomerName,Collectors.summingDouble(Order::getAmount)));
    }
}
