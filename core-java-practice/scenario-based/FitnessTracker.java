import java.util.Scanner;

public class FitnessTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] weeklyPushup = new int[7];
		int totalPushUp = 0 ;
		int workoutDays = 0 ;
		
		System.out.println("Enter the number of pushups in each day ");
		for(int i = 0 ; i < weeklyPushup.length ; i ++) {
			weeklyPushup[i] = sc.nextInt();
		}
		
		for(int pushups : weeklyPushup) {
			if(pushups == 0 ) {
				continue;
			}
			
			totalPushUp = totalPushUp + pushups;
			workoutDays++;
		}
		if(workoutDays > 0) {
			double average = totalPushUp / workoutDays;
			System.out.println("Total pushups : " + totalPushUp);
			System.out.println("Average : " + average);
			System.out.println("Workout Days : " + workoutDays);
		}else {
			System.out.println("No workout this week ! ");
		}
		
	}

}
