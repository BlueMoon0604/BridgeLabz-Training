class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " (age " + age + ") barks: baw baw");
    }
}
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " (age " + age + ") meows: meow! meow!");
    }
}
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    public void makeSound() {
        System.out.println(name + " (age " + age + ") chirps: Chirp chirp!");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Joffey", 3);
        Animal cat = new Cat("laena", 2);
        Animal bird = new Bird("chirgu", 1);
        Animal[] animals = {dog, cat, bird};
        System.out.println("Animal sounds:");
        for (Animal a : animals) {
            a.makeSound(); 
        }
    }
}
