public class PhoneDetails {
    String brand;
    String model;
    double price;
    
    void displayDetails() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        PhoneDetails p1 = new PhoneDetails();
        p1.brand = "VIVO";
        p1.model = "VIVO V29";
        p1.price = 15999.0;
        p1.displayDetails();
        
        PhoneDetails p2 = new PhoneDetails();
        p2.brand = "ONE PLUS";
        p2.model = "ONE PLUS nord4";
        p2.price = 39999.0;
        p2.displayDetails();
        
        PhoneDetails p3 = new PhoneDetails();
        p3.brand = "APPLE";
        p3.model = "iphone pro16";
        p3.price = 79999.0;
        p3.displayDetails();
    }
}
