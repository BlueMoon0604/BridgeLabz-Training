interface Worker {
    void performDuties();
}
class Customer {
    protected String name;
    protected String id;
    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends Customer implements Worker {
    public Chef(String name, String id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " (ID:" + id + ") is cooking dishes.");
    }
}
class Waiter extends Customer implements Worker {
    public Waiter(String name, String id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " (ID:" + id + ") is serving customers.");
    }
}
public class ResturantManagement {
    public static void main(String[] args) {
        Worker[] workers = { new Chef("Mario", "C001"),new Waiter("Luigi", "W001")};
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
