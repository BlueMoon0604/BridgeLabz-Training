package tableReservationSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableReseravtionSystem {
	private Map<Integer, Table> tables;
	private List<Reservation> reservation;
	
	public TableReseravtionSystem() {
		tables = new HashMap<>();
		reservation = new ArrayList<>();
		tables.put(1,  new Table(1, 8));
		tables.put(2, new Table(2, 6));
		tables.put(3, new Table(3, 5));
		tables.put(4, new Table(4, 9));
	}
	
	public void reserveTable(String customerName, int tableNo, String timeSlot)  throws TableAlreadyReservedException{
		Table table = tables.get(tableNo);
		if(table == null) {
			throw new TableAlreadyReservedException("Table does not exist");
		}
		if(!table.isAvailable()) {
			throw new TableAlreadyReservedException("Table is already reserved");
		}
		table.setAvailable(false);
		reservation.add(new Reservation(customerName, tableNo, timeSlot));
		System.out.println("Reservation Successful");	
	}
	public void cancelReservation(int tableNo) {
		Table table = tables.get(tableNo);
		if(table != null && !table.isAvailable()) {
			table.setAvailable(true);
			reservation.removeIf(r -> r.getTableNumber() == tableNo);
			System.out.println("Reservation cancelled");
		}else {
			System.out.println("No reservation found for Table " + tableNo);
		}
	}
	public void showAvailableTables() {
        System.out.println("Available Tables:");
        tables.values().stream()
              .filter(Table::isAvailable)
              .forEach(System.out::println);
    }
}
