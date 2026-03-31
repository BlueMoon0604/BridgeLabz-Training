package default_package;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] productPrices, int low, int high) {
		if(low < high) {
			int p = partion(productPrices, low, high);
			quickSort(productPrices, low, p - 1);
			quickSort(productPrices, high, p + 1);
		}
	}
	private static int partion(int[] productPrices, int low, int high) {
		int p = productPrices[high];
		int i = low - 1;
		for(int k = low ; k < high ; k ++) {
			if(productPrices[k] < p) {
				i++;
				int temp = productPrices[i];
				productPrices[i] = productPrices[k];
				productPrices[k] = temp;
			}
		}
		int temp = productPrices[i + 1];
		productPrices[i + 1]=  productPrices[high];
		productPrices[high] = temp;
		return i + 1;
	}
	public static void main(String[] args) {
		int[] productPrices = {999, 299, 799, 199, 499};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(productPrices));
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(productPrices));
	}

}
