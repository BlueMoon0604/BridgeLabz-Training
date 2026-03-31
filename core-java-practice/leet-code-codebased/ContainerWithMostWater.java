import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maximumArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            maximumArea = Math.max(maximumArea ,(right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maximumArea;
        
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter array size : ");
    	int size = sc.nextInt();
    	int[] height = new int[size];
    	for(int i = 0; i < size; i++) {
    		height[i] = sc.nextInt();
    	}
    	int maxWater = maxArea(height);
        System.out.println("Maximum water container holds: " + maxWater);
        sc.close();
    	
    }
}