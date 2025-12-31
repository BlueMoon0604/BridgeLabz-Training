public class Circle {
    double radius;
    Circle() {
        this(1.0);  
    }
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateAndDisplay() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Area of circle: %.4f%n", area);
        System.out.printf("Circumference of circle: %.4f%n", circumference);
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Default Circle:");
        circle1.calculateAndDisplay();
        System.out.println();
        Circle circle2 = new Circle(2.5);
        System.out.println("Parameterized Circle:");
        circle2.calculateAndDisplay();
    }
}
