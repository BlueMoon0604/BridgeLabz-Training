package default_package;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean isLeftSmaller = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean isRightSmaller = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];
            if (isLeftSmaller && isRightSmaller) {
                return arr[mid];
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeakElement(arr);
        System.out.println("Peak Element: " + peak);
    }
}

