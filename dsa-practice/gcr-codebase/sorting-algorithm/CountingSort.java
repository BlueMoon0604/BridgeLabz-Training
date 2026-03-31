package default_package;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        int minAge = 10;
        int maxAge = 18;
        int[] count = new int[maxAge - minAge + 1];
        for (int age : ages) {
            count[age - minAge]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }
        System.out.println("Sorted Ages ");
        System.out.println(Arrays.toString(ages));
    }
}
