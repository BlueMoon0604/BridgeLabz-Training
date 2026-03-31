package DependencyInjectionUsingReflection;

public class Main {
	public static void main(String[] args) {

        Car car = DIContainer.createObject(Car.class);
        car.drive();
    }
}
