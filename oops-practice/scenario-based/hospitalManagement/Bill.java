package hospitalManagement;

public class Bill {
    private Patient patient;
    private double amount;

    public Bill(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }
    public void showBill() {
        System.out.println("Patient Name : " + patient.getName());
        System.out.println("Total Amount : Rs. " + amount);
    }
}
