package shopping_cart;

import java.util.*;

public class ShoppingCartManager {

    private Map<String, Double> priceMap = new HashMap<>();
    private Map<String, Double> insertionOrderMap = new LinkedHashMap<>();

    public void addProduct(String name, double price) {
        priceMap.put(name, price);
        insertionOrderMap.put(name, price);
    }
    public void displayCartOrder() {
        System.out.println("\nCart items (Insertion Order):");
        for (Map.Entry<String, Double> entry : insertionOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : Rs. " + entry.getValue());
        }
    }
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nCart items (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " : Rs. " + entry.getKey());
        }
    }
}
