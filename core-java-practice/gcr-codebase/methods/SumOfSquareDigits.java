public class SumOfSquareDigits {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int n = countDigits(number);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);  
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;       
        return number % sum == 0;
    }

 
    public static int[][] digitFrequencies(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int distinct = 0;
        for (int f : freq) {
            if (f > 0) distinct++;
        }
        int[][] result = new int[distinct][2];
        int index = 0;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                result[index][0] = d;       
                result[index][1] = freq[d]; 
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 1729; 

        System.out.println("Number: " + number);

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean harshad = isHarshadNumber(number);
        System.out.println("Is Harshad number: " + harshad);

        int[][] freq = digitFrequencies(digits);
        System.out.println("Digit frequencies (digit : count):");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
    }
}
