package collections;

import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int severity;
    
    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
    public int compareTo(Patient other) {
        return other.severity - this.severity;
    }
    public String toString() {
        return name + "(" + severity + ")";
    }
}
public class HospitalTriage {
    public static void treatPatients() {
        PriorityQueue<Patient> triage = new PriorityQueue<>();
        triage.add(new Patient("Nova", 4));
        triage.add(new Patient("Kashhhh", 8));
        triage.add(new Patient("Raven", 1));
        
        System.out.print("Treatment order: ");
        while (!triage.isEmpty()) {
            System.out.print(triage.poll() + " ");
        }
    }
    public static void main(String[] args) {
        treatPatients();
    }
}
