package hospitalManagement;
public class OutPatient extends Patient implements IPayable {
    private double consultationFee;
    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type : Out-Patient");
        System.out.println("Bill Amount : Rs. " + calculateBill());
    }
}
