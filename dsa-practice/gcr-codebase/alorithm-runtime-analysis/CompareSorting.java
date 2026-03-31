package default_package;

public class CompareSorting {
	public static void bubbleSort(int[] arr ) {
		int n = arr.length;
		for(int i = 0 ; i < n - 1 ; i++) {
			for(int j = 0 ; j < n - i - 1 ; j ++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp; 
				}
			}
		}
		
	}
	public static void mergeSort(int[] arr, int left, int right ) {
		if(left < right) {
			int mid = left + (right - left)/ 2;
			mergeSort(arr, left , mid);
			mergeSort(arr, mid + 1, right);
			int[] temp = new int[right - left + 1];
			int i = left , j = mid + 1, k = 0;
			while( i <= mid && j <= right) {
				if(arr[i] <= arr[j]) {
					temp[k++]= arr[i++];
				}else {
					temp[k++] = arr[j++];
				}
				while( i <= mid) {
					temp[k++] = arr[i++];
				}
				while(j <= right) {
					temp[k++]= arr[j++];
				}
				for(int x = 0 ; x < temp.length ; x++) {
					arr[left + x] = temp[x];
				}
			}
		}
	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivot = arr[high];
			int partion = low;
			for(int i = low ; i < high ; i++) {
				if(arr[i] <= pivot) {
					int temp = arr[i];
					arr[i] = arr[partion];
					arr[partion] = temp;
					partion++;
				}
			}
			int temp = arr[partion];
			arr[partion] = arr[high];
			arr[high] = temp;
			quickSort(arr, low, partion - 1);
			quickSort(arr, partion + 1, high);
		}
	}
	public static void main(String[] args) {
		int[] sizes = {1000, 10000, 1000000};
		for(int i = 0 ; i < sizes.length ; i++) {
			int N = sizes[i];
			int[] dataset = new int[N];
			for(int j = 0 ; j < N ; j++) {
				dataset[j] = j;
			}
			// Bubble Sort
			if(N <= 10000) {
				int[] bubbleArr = dataset.clone();
				long startTime = System.nanoTime();
				bubbleSort(bubbleArr);
				long endTime = System.nanoTime();
				long bubbleSortTime = endTime - startTime;
				System.out.println("Bubble Sort Time " + bubbleSortTime / 1000000 +"ms");
			}else {
				System.out.println("Bubble Sort Time : Not possible");
            }
			// Merge Sort
			int[] mergeArr = dataset.clone();
			long startTime = System.nanoTime();
			mergeSort(mergeArr, 0, mergeArr.length - 1);
			long endTime = System.nanoTime();
			long mergeSortTime = endTime - startTime;
			System.out.println("Merge sort time " + mergeSortTime + "ms");
			
			// Quick Sort
			int[] quickArr = dataset.clone();
			startTime = System.nanoTime();
			quickSort(quickArr, 0, quickArr.length - 1);
			endTime = System.nanoTime();
			long quickSortTime = System.nanoTime();
			System.out.println("Quick sort time " + quickSortTime + "ms");
		}
	}

}
