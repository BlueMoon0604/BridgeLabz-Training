import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long start = 1 ; 
        long end = num;
        while(start <= end ){
            long mid = start + (end - start)/2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid > num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter a number: ");
    	int num = sc.nextInt();
    	if(isPerfectSquare(num)) {
    		System.out.println("It is Perfect Square");
    	}else {
    		System.out.println("It is not a perfect square");
    	}
    }
}