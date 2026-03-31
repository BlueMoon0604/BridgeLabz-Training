package tableReservationSystem;

public class Table {
	private int tableNo ;
	private int capacity;
	private boolean isAvailable;
	
	public Table(int tableNo, int capacity) {
		this.tableNo = tableNo;
		this.capacity = this.capacity;
		this.isAvailable = true;
	}
	public int getTableNumber() {
		return tableNo;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}
	public String toString() {
		return "Table" + tableNo + " have capacity => " + capacity + "Availablity => Reserved"; 
	}

}
