package default_package;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		// Created array for sorting
		int[] marks = new int[n];
		int len = marks.length;
		// fill elements of choice
		for(int i = 0; i < len; i++) {
			marks[i] = sc.nextInt();
		}
		for(int i = 0; i < len - 1 ; i++) {
			boolean swapped = false;
			for(int k = 0 ; k < len - i - 1; k++) {
				if(marks[k] > marks[k + 1]) {
					int temp = marks[k];
					marks[k] = marks[k + 1];
					marks[k + 1] = temp; 
					swapped = true;
				}
			}
			if(!swapped) {
				return;
			}
			System.out.println(Arrays.toString(marks));
		}
		
	}
		
}
			
				
		
		
		

