package hospitalManagement;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }
    public void displayDoctor() {
        System.out.println("Doctor ID : " + doctorId);
        System.out.println("Name : " + name);
        System.out.println("Speciality : " + specialization);
    }
}
