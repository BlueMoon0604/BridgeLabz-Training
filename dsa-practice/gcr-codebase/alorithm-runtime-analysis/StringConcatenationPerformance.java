package default_package;

public class StringConcatenationPerformance {
    public static void usingString(int N) {
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "a";
        }
    }
    public static void usingStringBuilder(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
    }
    public static void usingStringBuffer(int N) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int i = 0; i < sizes.length; i++) {
            int N = sizes[i];
            System.out.println("Operations Count => " + N);

            // String 
            if (N <= 10000) { 
                long start = System.nanoTime();
                usingString(N);
                long end = System.nanoTime();
                System.out.println("String Time : " + (end - start) / 1000000.0 + " ms");
            } else {
                System.out.println("String Time : Unusable ");
            }
            // StringBuilder
            long start = System.nanoTime();
            usingStringBuilder(N);
            long end = System.nanoTime();
            System.out.println("StringBuilder Time : " + (end - start) / 1000000.0 + " ms");

            // StringBuffer
            start = System.nanoTime();
            usingStringBuffer(N);
            end = System.nanoTime();
            System.out.println("StringBuffer Time  : " + (end - start) / 1000000.0 + " ms");
        }
    }
}
