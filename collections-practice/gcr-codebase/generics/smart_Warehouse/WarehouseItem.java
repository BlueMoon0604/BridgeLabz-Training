 package smart_Warehouse;

 public abstract class WarehouseItem {
	    protected String id;
	    protected String name;
	    
	    public WarehouseItem(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public abstract String getCategory();
	    public String getDetails() {
	        return "ID: " + id + ", Name: " + name + ", Category: " + getCategory();
	    }
	}

