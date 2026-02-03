package streamBuzz;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program {
	public void registerCreator(CreatorStats record) {
		CreatorStats.engagementBoard.add(record);
		System.out.println("Creator is registered successfully");
	}
	public HashMap<String, Integer> getTopPostCount(List<CreatorStats> records, double threshold){
		HashMap<String, Integer> res = new HashMap<>();
		for(CreatorStats c : records) {
			int count = 0;
			for(double like : c.weeklyLikes) {
				if(like >= threshold) {
					count++;
				}
			}
			if(count > 0) {
				res.put(c.creatorName, count);
			}
		}
		return res;
	}
	public double calculateAverageLikes() {
		double sum = 0;
		int total = 0;
		for(CreatorStats c : CreatorStats.engagementBoard) {
			for(double like : c.weeklyLikes) {
				sum = sum + like;
				total++;
			}
		}
		if(total == 0) {
			return 0;
		}
		return sum / total;
	}
	public static void main(String[] args) {
		Program p1 = new Program();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1 => Register the creator");
			System.out.println("2 => Show top posts creators");
			System.out.println("3 => Calculate average likes of creator");
			System.out.println("4 => Exit");
			System.out.println("5 => enter your choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
				System.out.println("enter creator's name");
				String name = sc.nextLine();
				
				System.out.println("Enter weekly likes (Week 1 to 4):");
				double[] likes = new double[4];

				for (int i = 0; i < 4; i++) {
				    while (true) {
				        try {
				            likes[i] = sc.nextDouble(); 
				            sc.nextLine(); 
				            break;
				        } catch (Exception e) {
				            System.out.println("Please enter numbers only:");
				            sc.nextLine(); 
				        }
				    }
				}

				CreatorStats cs = new CreatorStats(name, likes);
				p1.registerCreator(cs);
				break;
			case 2 :
				System.out.print("Enter like threshold: ");

				while (!sc.hasNextDouble()) {
				    System.out.println("Please enter a valid number:");
				    sc.next();
				}
				double threshold = sc.nextDouble();
				sc.nextLine();

				 HashMap<String, Integer> map = p1.getTopPostCount(CreatorStats.engagementBoard, threshold);
				 if(map.isEmpty()) {
					 System.out.println("No top-performing posts this week");
				 }else {
					 for(String key : map.keySet()){
						 System.out.println(key + ":" + map.get(key));
					 }
				 }
				 break;
			case 3 :
				double avg = p1.calculateAverageLikes();
				System.out.println("Overall average weekly likes" + avg);
				break;
			
			case 4 :
				System.out.println("Logging off — Keep Creating with StreamBuzz!");
				return;
			}
			System.out.println();
		}
	}

}
