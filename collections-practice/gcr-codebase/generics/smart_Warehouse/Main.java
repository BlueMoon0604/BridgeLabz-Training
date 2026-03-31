package smart_Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displayAllItems(List<? extends WarehouseItem> itemsList) {
        for (WarehouseItem item : itemsList) {
            System.out.println(item.getDetails());
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E001", "Fridge"));
        electronicsStorage.addItem(new Electronics("E002", "Microwave"));
        
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("G001", "Grains"));
        groceriesStorage.addItem(new Groceries("G002", "Soyabean"));
        
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F001", "Sofa"));
        furnitureStorage.addItem(new Furniture("F002", "Cabinet"));
        
        System.out.println("Electronics Storage (size: " + electronicsStorage.size() + "):");
        displayAllItems(electronicsStorage.getItems());
        
        System.out.println("Groceries Storage (size: " + groceriesStorage.size() + "):");
        displayAllItems(groceriesStorage.getItems());
        
        System.out.println("Furniture Storage (size: " + furnitureStorage.size() + "):");
        displayAllItems(furnitureStorage.getItems());
        
        System.out.println("All items across storages:");
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceriesStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());
        displayAllItems(allItems);
    }
}

