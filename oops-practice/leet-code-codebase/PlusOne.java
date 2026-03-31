public class PlusOne {

    public int[] plusOne(int[] digits) {
        int num = digits.length;

        for (int i = num - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }
        int[] newDigits = new int[num + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        PlusOne sol = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] res = sol.plusOne(digits);
        System.out.print("Result ");
        for (int d : res) {
            System.out.print(d + " ");
        }
    }
}
