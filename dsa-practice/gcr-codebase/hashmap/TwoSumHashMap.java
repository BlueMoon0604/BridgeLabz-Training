package default_package;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numm = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int comp = target - nums[i];
            if (numm.containsKey(comp)) {
                return new int[]{numm.get(comp), i};
            }
            numm.put(nums[i], i);
        }
        return new int[]{}; 
    }
    public static void main(String[] args) {
        TwoSumHashMap sol = new TwoSumHashMap();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
