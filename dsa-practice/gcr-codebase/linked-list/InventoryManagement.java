class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList {
    private ItemNode head;
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addAtPosition(int position, int id, String name, int qty, double price) {
        if (position == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed");
        } else {
            System.out.println("Item not found");
        }
    }
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: Rs. " + total);
    }
    public void displayAllItems() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }
    private void displayItem(ItemNode item) {
        System.out.println("Item ID: " + item.itemId + ", Name: " + item.itemName + ", Quantity: " + item.quantity + ", Price: " + item.price);
    }
}
public class InventoryManagement {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        inventory.addAtEnd(6000, "Laptop", 4, 95000);
        inventory.addAtBeginning(6005, "Mouse", 40, 6500);
        inventory.addAtEnd(6700, "Keyboard", 10, 6700);
        inventory.addAtPosition(2, 7800, "Monitor", 60, 80000);

        System.out.println("All Items: ");
        inventory.displayAllItems();

        System.out.println("Search item id 6000:");
        inventory.searchById(6000);

        System.out.println("Update quantity of item by item id :");
        inventory.updateQuantity(6700, 30);

        System.out.println("Remove item by item id : ");
        inventory.removeById(7800);

        System.out.println("Final Inventory: ");
        inventory.displayAllItems();

        System.out.println();
        inventory.calculateTotalValue();
    }
}