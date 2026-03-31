package tableReservationSystem;

import java.util.Objects;

public class Reservation {
	private String customerName;
	private int tableNo;
	private String timeSlot;
	
	public Reservation(String customerName, int tableNo, String timeSlot) {
		this.customerName = customerName;
		this.tableNo = tableNo;
		this.timeSlot = timeSlot;
	}
	public int getTableNumber() {
		return tableNo;
		
	}
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Reservation)) {
			return false;
		}
		Reservation other = (Reservation) obj;
		return tableNo == other.tableNo;
	}
	public int hashCode() {
		return Objects.hash(tableNo);
	}
	public String toString() {
		return "Reservation at table " + tableNo + "By" + customerName + "At" + timeSlot;
	}

}
