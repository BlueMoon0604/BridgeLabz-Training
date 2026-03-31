package oceanFleet;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();
		System.out.println("Enter the number of vessels");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter details of vessel");
		for(int i = 0; i < n ; i++) {
			String input = sc.nextLine();
			String[] data = input.split(":");
			Vessel vessel1 = new Vessel(data[0], data[1], Double.parseDouble(data[2]), data[3]);
			util.addVesselPerformance(vessel1);
		}
		System.out.println("enter vessel id to check");
		String id = sc.nextLine();
		
		Vessel found = util.getVesselById(id);
		if(found != null) {
			 System.out.println(found.getVesselId() + " | " + found.getVesselName() + " | " + found.getVesselType() + " | " + found.getAverageSpeed() + " knots");
		}else {
			System.out.println(id + "vessel id not found");
		}
		System.out.println("High Performance vessels are");
		List<Vessel> vessels = util.getHighPerformanceVessels();
		for(Vessel v : vessels) {
			System.out.println(v.getVesselId() + " | " + v.getVesselName() + " | " + v.getVesselType() + " | " + v.getAverageSpeed() + " knots");
		}
			
	}

}
