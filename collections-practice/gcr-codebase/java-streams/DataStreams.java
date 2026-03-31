package collections;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        String fileName = "student.dat";
        int rollNo = 45;
        String name = "Nova";
        double gpa = 8.9;

        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int r = dis.readInt();
            String n = dis.readUTF();
            double g = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + r);
            System.out.println("Name: " + n);
            System.out.println("GPA: " + g);

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}

