package default_package;

import java.util.Stack;

public class StockSpan {
	public static int[] calculateSpan(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];
	
		Stack<Integer> s = new Stack<>();
		span[0]= 1;
		s.push(0);
		for(int i = 0; i < n ; i++) {
			while(!s.isEmpty() && prices[s.peek()] <= prices[i]) {
				s.pop();
			}
			span[i] = s.isEmpty() ? (i + 1) : (i- s.peek());
			s.push(i);
		}
		return span;
	}
	public static void main(String[] args) {
		int[] prices = {23, 45, 67, 78, 60};
		int[] res = calculateSpan(prices);
		for(int s : res) {
			System.out.print(s + " ");
		}
		
	}


}
