package default_package;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[] scores = new int[n];
		int len = scores.length;
		for(int i = 0; i < len; i++) {
			scores[i] = sc.nextInt();
		}
		for(int s = 0; s < len - 1; s++) {
			int min = s;
			for(int j = s + 1 ; j < len ; j++) {
				if(scores[j] < scores[min]) {
					min = j;
				}
			}
			int temp = scores[min];
			scores[min] = scores[s];
			scores[s] = temp;
		}
		System.out.print(Arrays.toString(scores));
	}

}
