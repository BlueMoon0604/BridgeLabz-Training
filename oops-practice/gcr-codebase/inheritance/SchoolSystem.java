class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayRole() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}
class Teacher extends Person {
    protected String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void displayRole() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}
class Student extends Person {
    protected String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}
class Staff extends Person {
    protected String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayRole() {
        System.out.println("Staff: " + name + ", Age: " + age + ", Department: " + department);
    }
} 
public class SchoolSystem {
    public static void main(String[] args) {
        Person[] people = {
            new Teacher("Mr.Singh", 98, "AI"), new Student("aemond", 18, "10th"), new Staff("Ms.Rown", 35, "Admin")};
        for (Person p : people) {
            p.displayRole();
        }
    }
}
