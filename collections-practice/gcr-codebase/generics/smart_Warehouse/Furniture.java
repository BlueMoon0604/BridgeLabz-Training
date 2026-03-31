package smart_Warehouse;

public class Furniture extends WarehouseItem {
    public Furniture(String id, String name) {
        super(id, name);
    }
    public String getCategory() {
        return "Furniture";
    }
}

