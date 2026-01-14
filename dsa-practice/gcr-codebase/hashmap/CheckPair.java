package default_package;

import java.util.HashMap;
import java.util.Map;

public class CheckPair {
    public static boolean hasPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int required = target - current;
            if (map.containsKey(required)) {
                System.out.println("Pair found: (" + required + ", " + current + ")");
                return true;
            }
            map.put(current, i);
        }

        System.out.println("No is pair found");
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {9,3,45,16,12,10};
        int target = 10;

        hasPair(arr, target);
    }
}
