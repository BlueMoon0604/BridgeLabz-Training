package default_package;

public class CompareStrings {
    public static void main(String[] args) {
        final int COUNT = 1_000_000;
        String testStr = "programming";
       
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append(testStr);
        }
        sb.toString();
        long sbTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            sbf.append(testStr);
        }
        sbf.toString();
        long sbfTime = System.nanoTime() - start;
        System.out.println("StringBuilder time: " + (sbTime / 1_000_000.0) + " ms");
        System.out.println("StringBuffer time: " + (sbfTime / 1_000_000.0) + " ms");
        System.out.println("StringBuilder is " + String.format("%.2f", (double)sbfTime/sbTime) + "x faster");
    }
}
