package hospitalManagement;

public class InPatient extends Patient implements IPayable {

    private int daysAdmitted;
    private double dailyCharge;
    public InPatient(int id, String name, int age, int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type : In-Patient");
        System.out.println("Days Stayed : " + daysAdmitted);
        System.out.println("Bill Amount : ₹" + calculateBill());
    }
}
