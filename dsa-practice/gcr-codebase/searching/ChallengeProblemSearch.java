package default_package;

import java.util.Arrays;

public class ChallengeProblemSearch {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num >= 1 && num <= n && nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println("Test Case 1: " + Arrays.toString(nums1));
        System.out.println("First missing positive: " + firstMissingPositive(nums1));
        
        System.out.println("\nTest Case 2: " + Arrays.toString(nums2));
        System.out.println("First missing positive: " + firstMissingPositive(nums2));
        
        System.out.println("\nTest Case 3: " + Arrays.toString(nums3));
        System.out.println("First missing positive: " + firstMissingPositive(nums3));
        
        int[] sorted = {1, 3, 5, 7, 9, 11};
        System.out.println("\nBinary Search - Target 7: " + binarySearch(sorted, 7));
        System.out.println("Binary Search - Target 4: " + binarySearch(sorted, 4));
    }
}


