public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    
    private final String patientID;
    private String name;
    private int age;
    private String ailment;
    public Patient(String name, String patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient instance.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAilment() {
        return ailment;
    }
    public void setAilment(String ailment) {
        this.ailment = ailment;
    }
    public static void main(String[] args) {
        getTotalPatients();
        System.out.println(); 
        Patient patient1 = new Patient("Lathika", "P001", 30, "Flu");
        patient1.displayPatientDetails();
        System.out.println();
        
        Patient patient2 = new Patient("Lidiya", "P002", 45, "Fracture");
        patient2.displayPatientDetails();
    }
}
