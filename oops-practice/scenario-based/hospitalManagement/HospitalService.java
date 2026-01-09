package hospitalManagement;

import java.util.ArrayList;
public class HospitalService {

    private ArrayList<Patient> patients = new ArrayList<>();
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    public void showAllPatients() {
        for (Patient p : patients) {
            p.displayInfo(); 
        }
    }
}
