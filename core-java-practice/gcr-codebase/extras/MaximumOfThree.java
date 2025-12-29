import java.util.Scanner;

public class MaximumOfThree {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = getThreeInputs(sc);
        int max = findMaximum(nums);
        
        System.out.println("Maximum number: " + max);
        
    }
    private static int[] getThreeInputs(Scanner scanner) {
        int[] inputs = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }
        
        return inputs;
    }
    
    private static int findMaximum(int[] nums) {
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        return max;
    }
}
