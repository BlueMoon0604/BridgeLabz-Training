package default_package;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChallengeProblem {
    public static void main(String[] args) throws IOException {
        benchmarkStringConcatenation();
        benchmarkFileReading("large-file.txt");
    }
    static void benchmarkStringConcatenation() {
        final int COUNT = 1_000_000;
        String testStr = "hello";
        long start = System.nanoTime();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            stringBuilder.append(testStr);
        }
        stringBuilder.toString();

        long stringBuilderTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            stringBuffer.append(testStr);
        }
        stringBuffer.toString();
        long stringBufferTime = System.nanoTime() - start;
        System.out.printf("StringBuilder Time: %.2f ms%n",
                stringBuilderTime / 1_000_000.0);

        System.out.printf("StringBuffer Time: %.2f ms%n",
                stringBufferTime / 1_000_000.0);

        System.out.printf("StringBuilder is %.2fx faster%n%n",
                (double) stringBufferTime / stringBuilderTime);
    }
    static long benchmarkFileReading(String filename) throws IOException {
        createLargeFile(filename, 100_000);
        
        long start = System.nanoTime();
        long fileReaderWordCount = countWordsWithFileReader(filename);
        long fileReaderTime = System.nanoTime() - start;
        start = System.nanoTime();
        long inputStreamReaderWordCount = countWordsWithInputStreamReader(filename);
        long inputStreamReaderTime = System.nanoTime() - start;
        System.out.printf("FileReader Word Count: %d (%.2f ms)%n",
                fileReaderWordCount, fileReaderTime / 1_000_000.0);

        System.out.printf("InputStreamReader Word Count: %d (%.2f ms)%n",
                inputStreamReaderWordCount, inputStreamReaderTime / 1_000_000.0);

        return fileReaderWordCount;
    }
    static long countWordsWithFileReader(String filename) throws IOException {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(filename))) {

            return countWords(bufferedReader);
        }
    }
    static long countWordsWithInputStreamReader(String filename) throws IOException {
        try (BufferedReader bufferedReader =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(filename),
                                     StandardCharsets.UTF_8))) {

            return countWords(bufferedReader);
        }
    }
    static long countWords(BufferedReader bufferedReader) throws IOException {
        long wordCount = 0;
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                wordCount += line.split("\\s+").length;
            }
        }
        return wordCount;
    }
    static void createLargeFile(String filename, int lineCount) throws IOException {
        try (PrintWriter printWriter =
                     new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < lineCount; i++) {
                printWriter.println("Java programming benchmark test line " + i + " with multiple words for counting.");
            }
        }
    }
}


