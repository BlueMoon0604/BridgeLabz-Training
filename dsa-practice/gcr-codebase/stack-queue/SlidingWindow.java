package default_package;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static int[] maxSlidingWindow(int[] numbers, int k) {
        if (numbers == null || k <= 0) {
            return new int[0];
        }
        int n = numbers.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && numbers[deque.peekLast()] < numbers[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                res[i - k + 1] = numbers[deque.peekFirst()];
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 8, -9, -3, -4, 5};
        int k = 3;
        int[] answer = maxSlidingWindow(numbers, k);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}

