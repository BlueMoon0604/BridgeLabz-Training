public class CircleArea {
    double radius;
    
    CircleArea(double r) {
        radius = r;
    }
    void calculateAndDisplay() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Area of circle: %.4f%n", area);
        System.out.printf("Circumference of circle: %.4f%n", circumference);
    }
    
    public static void main(String[] args) {
        CircleArea circle = new CircleArea(2.5); 
        circle.calculateAndDisplay();
    }
}
