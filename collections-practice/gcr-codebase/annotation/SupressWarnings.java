package collectiontwo;

import java.util.ArrayList;

public class SupressWarnings {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Nova");
		list.add(34);
		list.add(6.8);
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
	

}
