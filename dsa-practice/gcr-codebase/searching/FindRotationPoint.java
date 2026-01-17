package default_package;

public class FindRotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;  
    }
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2};  
        int[] arr2 = {3, 4, 5, 1, 2};        
        int[] arr3 = {11, 13, 15, 17};     
        int[] arr4 = {2, 1};                 
        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Rotation point: " + findRotationPoint(arr1));
        
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.println("Rotation point: " + findRotationPoint(arr2));
        
        System.out.println("Array 3: " + java.util.Arrays.toString(arr3));
        System.out.println("Rotation point: " + findRotationPoint(arr3));
        
        System.out.println("Array 4: " + java.util.Arrays.toString(arr4));
        System.out.println("Rotation point: " + findRotationPoint(arr4));
    }
}
