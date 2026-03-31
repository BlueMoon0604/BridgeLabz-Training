import java.util.Scanner;

public class CountPrime {
    public static int countPrimes(int n) {
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=i;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==0){
                continue;
            }
            for(int j = i; j < n ; j+=i){
                if(arr[j]!=i){
                    arr[j]=0;
                }
            }
            
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(arr[i] > 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the number : ");
    	int n = sc.nextInt();
    	int numberOfPrimes = countPrimes(n);
    	System.out.println("Number of prime numbers strictly less than n is :" + numberOfPrimes);
    	
    }
}