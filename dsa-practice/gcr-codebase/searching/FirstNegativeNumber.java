package default_package;

public class FirstNegativeNumber {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; 
            }
        }
        return -1;  
    }
    public static void main(String[] args) {
        int[] numbers1 = {5, 8, 3, -2, 7, -9, 1};
        int[] numbers2 = {1, 5, 8, 10, 15};
        int[] numbers3 = {-1, 3, 5, 7};
        System.out.println("Array 1: " + java.util.Arrays.toString(numbers1));
        System.out.println("First negative at index: " + findFirstNegative(numbers1));
        
        System.out.println("Array 2: " + java.util.Arrays.toString(numbers2));
        System.out.println("First negative at index: " + findFirstNegative(numbers2));
        
        System.out.println("Array 3: " + java.util.Arrays.toString(numbers3));
        System.out.println("First negative at index: " + findFirstNegative(numbers3));
    }
}
