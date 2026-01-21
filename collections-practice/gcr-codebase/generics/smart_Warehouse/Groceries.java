package smart_Warehouse;

public class Groceries extends WarehouseItem {
    public Groceries(String id, String name) {
        super(id, name);
    }
    public String getCategory() {
        return "Groceries";
    }
}
