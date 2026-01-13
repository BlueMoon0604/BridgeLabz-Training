package traffic_manager;

public class Roundabout {
    private VehicleNode tail;
    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(vehicleNumber + " entered the roundabout.");
    }
    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty!");
            return;
        }
        VehicleNode head = tail.next;
        if (head == tail) {
            System.out.println(head.vehicleNumber + " exited the roundabout.");
            tail = null;
        } else {
            System.out.println(head.vehicleNumber + " exited the roundabout.");
            tail.next = head.next;
        }
    }
    public void display() {
        if (tail == null) {
            System.out.println("Roundabout is empty.");
            return;
        }
        VehicleNode temp = tail.next;
        System.out.print("Roundabout Vehicles ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }
}

