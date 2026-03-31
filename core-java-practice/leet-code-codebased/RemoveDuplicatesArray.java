import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesArray {
     public static int removeDuplicates(int[] nums) {
        int n = nums.length, l = 1;
        for (int r = 1; r <= n - 1; r++) {
            if (nums[r] != nums[l - 1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int uniqueCount = removeDuplicates(nums);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount)));
        
        sc.close();
    }
}
