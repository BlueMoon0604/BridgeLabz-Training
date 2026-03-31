package collections;

import java.io.*;

public class EfficientFileCopy {
    private static final int BUFFER_SIZE = 4096; 
    public static void main(String[] args) {

        String source = "largeFile.dat";   
        String normalDest = "normalCopy.dat";
        String bufferedDest = "bufferedCopy.dat";

        copyUsingNormalStreams(source, normalDest);
        copyUsingBufferedStreams(source, bufferedDest);
    }
    public static void copyUsingNormalStreams(String src, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Normal Stream Error: " + e.getMessage());
            return;
        }
        long endTime = System.nanoTime();
        System.out.println("Normal Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    public static void copyUsingBufferedStreams(String src, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered Stream Error: " + e.getMessage());
            return;
        }
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
