import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer , Integer> numm = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            int comp = target - nums[i];
            if(numm.containsKey(comp)){
                return new int[] {numm.get(comp), i};
            }
            numm.put(nums[i], i);
        }
        return new int[]{}; 
        
    }
}
    

