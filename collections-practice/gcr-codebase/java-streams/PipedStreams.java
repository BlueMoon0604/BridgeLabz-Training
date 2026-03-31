package collections;

import java.io.*;

public class PipedStreams {
    public static void main(String[] args) {
        try {

            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello Motto";
                    pos.write(message.getBytes());
                    pos.flush();
                    pos.close();
                } catch (IOException e) {
                    System.out.println("Writer Error: " + e.getMessage());
                }
            });
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader Error: " + e.getMessage());
                }
            });
            readerThread.start();
            writerThread.start();
            writerThread.join();
            readerThread.join();

        } catch (Exception e) {
            System.out.println("Main Error: " + e.getMessage());
        }
    }
}
