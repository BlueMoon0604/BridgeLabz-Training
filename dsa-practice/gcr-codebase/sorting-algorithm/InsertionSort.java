package default_package;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		// Created array for sorting
		int[] employeeIds = new int[n];
		int len = employeeIds.length;
		// fill IDs
		for(int i = 0; i < len; i++) {
			employeeIds[i] = sc.nextInt();
		}
		for(int k = 1; k <= len - 1; k++) {
			int key = employeeIds[k];
			int a = k - 1;
			while(a >= 0 && employeeIds[a] > key) {
				employeeIds[a + 1]= employeeIds[a];
				a--;
			}
			employeeIds[a + 1] = key;
		}
		System.out.println(Arrays.toString(employeeIds));
	}
	
}
