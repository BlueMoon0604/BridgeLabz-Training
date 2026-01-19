package default_package;

import java.util.Arrays;

public class SearchComparing {
	public static int linearSearch(int[] arr, int target) {
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int[] sizes = {1000, 10000, 1000000};
		for(int i = 0 ; i < sizes.length; i++) {
			int N = sizes[i];
			int target = N - 1;
			int[] data = new int[N];
			for(int j = 0; j < N ; j++) {
				data[i] = i;
			}
			// Linear Search
			long startTime = System.nanoTime();
			linearSearch(data, target);
			long endTime = System.nanoTime();
			long linearTime = endTime - startTime;
			
			// Binary Search
			Arrays.sort(data);
			startTime = System.nanoTime();
			binarySearch(data, target);
			endTime = System.nanoTime();
			long binaryTime = endTime - startTime;
			
			System.out.println("Dataset Size => " + N);
			System.out.println("Time in Binary Search : " + binaryTime / 1000000 + "ms");
			System.out.println("Time in Linear Search : " + linearTime / 1000000 + "ms");
		}
	}
}
