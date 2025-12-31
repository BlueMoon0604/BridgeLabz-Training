public class Person {
    String name;
    int age;
    String city;
    Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Unknown";
    }
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.city = other.city;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
    public static void main(String[] args) {
        Person person1 = new Person("shantun", 21, "Pune");
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println();
        Person person2 = new Person(person1);
        System.out.println("Cloned Person (Copy Constructor):");
        person2.displayDetails();
        System.out.println();
        person2.age = 35;
        System.out.println("After modifying copy:");
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println("Cloned Person:");
        person2.displayDetails();
    }
}
