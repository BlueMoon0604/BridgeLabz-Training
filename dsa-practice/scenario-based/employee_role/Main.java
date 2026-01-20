package employee_role;

public class Main {
    public static void main(String[] args) {

        Employee manager = new Manager("Nova", 80000);
        System.out.printf("%.2f%n", manager.getBonus());

        Employee devHigh = new Developer("Raven", 60000);
        System.out.printf("%.2f%n", devHigh.getBonus());

        Employee devLow = new Developer("Natasha", 40000);
        System.out.printf("%.2f%n", devLow.getBonus());
    }
}
