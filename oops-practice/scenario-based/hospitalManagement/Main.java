package hospitalManagement;

public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        Doctor doctor = new Doctor(1, "Dr. Blue", "Cardiologist");
        Patient p1 = new InPatient(101, "Raven", 25, 6, 95000);
        Patient p2 = new OutPatient(102, "Baron", 32, 7000);
        service.addPatient(p1);
        service.addPatient(p2);
        System.out.println("Doctor Details:");
        doctor.displayDoctor();
        System.out.println("Patient Details:");
        service.showAllPatients();

        IPayable bill1 = (IPayable) p1;
        IPayable bill2 = (IPayable) p2;
        Bill b1 = new Bill(p1, bill1.calculateBill());
        Bill b2 = new Bill(p2, bill2.calculateBill());
        System.out.println("Bill:");
        b1.showBill();
        b2.showBill();
    }
}
