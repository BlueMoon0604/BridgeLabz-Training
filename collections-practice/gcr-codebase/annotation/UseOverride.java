package collectiontwo;

class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}
class Dog extends Animal {

 @Override
 public void makeSound() {
     System.out.println("Dog barks");
 }
}

//Main class
public class UseOverride {
 public static void main(String[] args) {

     Dog d = new Dog();   
     d.makeSound();      // Call overridden method
 }
}
