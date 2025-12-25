import java.util.Arrays;

public class FourDigitRandom {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3]; 
        if (numbers.length == 0) {
            return result; 
        }

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        result[0] = sum / numbers.length; 
        result[1] = min; 
        result[2] = max; 

        return result;
    }

    public static void main(String[] args) {
        int[] randomArray = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(randomArray);

        System.out.println("Generated 4-digit numbers: " + Arrays.toString(randomArray));
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}
