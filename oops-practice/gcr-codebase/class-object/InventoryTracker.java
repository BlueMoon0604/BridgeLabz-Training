public class InventoryTracker {
    String itemCode;
    String itemName;
    double price;
    
    void displayDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("-----------------");
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
        System.out.println();
    }
    public static void main(String[] args) {
        InventoryTracker itemOne = new InventoryTracker();
        itemOne.itemCode = "01AA";
        itemOne.itemName = "Water bottle";
        itemOne.price = 500.0;
        itemOne.displayDetails(1);
        
        InventoryTracker itemTwo = new InventoryTracker();
        itemTwo.itemCode = "01BB";
        itemTwo.itemName = "Rice";
        itemTwo.price = 700.0;
        itemTwo.displayDetails(1);
        
        InventoryTracker itemThree = new InventoryTracker();
        itemThree.itemCode = "02AA";
        itemThree.itemName = "blackboard";
        itemThree.price = 400.0;
        itemThree.displayDetails(1);
    }
}
