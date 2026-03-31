import java.util.Scanner;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();
        ClimbingStairs sol = new ClimbingStairs();
        int ways = sol.climbStairs(n);
        System.out.println("Number of ways to climb stairs =>  " + ways);
        sc.close();
    }
}
