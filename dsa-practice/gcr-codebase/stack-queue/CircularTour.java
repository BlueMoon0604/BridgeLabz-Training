package default_package;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Queue<Integer> queue = new LinkedList<>();

        int start = 0;
        int surplus = 0;
        for (int i = 0; i < n; i++) {

            surplus += petrol[i] - distance[i];
            queue.offer(i);
            while (surplus < 0 && !queue.isEmpty()) {
                int removed = queue.poll();
                surplus -= (petrol[removed] - distance[removed]);
                start = removed + 1;
            }
        }
        return (queue.size() == n) ? start : -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStartingPoint(petrol, distance));
    }
}
