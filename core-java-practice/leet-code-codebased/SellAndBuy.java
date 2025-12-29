import java.util.Scanner;

public class SellAndBuy {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0], profit = 0;
        for (int i = 1; i < n ; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } 
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the size of array  : ");
    	int size = sc.nextInt();
    	int[] prices = new int[size];
    	for(int i = 0;i < size; i++) {
    		prices[i] = sc.nextInt();
    	}
    	int profit = maxProfit(prices);
    	System.out.println("Profit from selling and buying is : " + profit);
    }
}