 import java.util.ArrayList;
import java.util.List;
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    abstract double calculateBill();
    String getPatientDetails() {
        return patientId + " - " + name + " (Age: " + age + ")";
    }
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();
    InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }
    double calculateBill() {
        return daysAdmitted * dailyRate;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();
    OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }
    double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Anna", 56, 3, 2000);
        Patient p2 = new OutPatient("P002", "Tommy", 15, 500);
        ((MedicalRecord)p1).addRecord("Admitted for heart surgery");
        ((MedicalRecord)p2).addRecord("monthly checkup");
        Patient[] patients = { p1, p2 };
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails() + " - Bill: " + p.calculateBill());
        }
    }
}
