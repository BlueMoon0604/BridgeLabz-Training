package default_package;

import java.util.Scanner;

public class FibonacciChecker {
	public static int fibonacciRecursion(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}
	public static int fibonacciIterative(int n) {
		int a = 0 , b = 1 , sum ;
		for(int i = 2 ; i <= n ; i++) {
			sum = a + b;
			a = b ;
			b = sum ;
		}
		return b ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		// Recursive Approach
		long start = System.nanoTime();
		int res = fibonacciRecursion(n);
		long end = System.nanoTime();
		long recursiveTime = end - start;
		
		// Iterative Approach
		start = System.nanoTime();
		res = fibonacciIterative(n);
		end = System.nanoTime();
		long iterativeTime = end - start;
		
		System.out.println("Fibonacci Result by recursion " + res);
		System.out.println("Recursive Time" + (recursiveTime / 1000000) + "ms");
		
		System.out.println("Fibonacci Result by iteration " + res);
		System.out.println("Iteration Time" + (iterativeTime / 1000000) + "ms");
		
	}

}
