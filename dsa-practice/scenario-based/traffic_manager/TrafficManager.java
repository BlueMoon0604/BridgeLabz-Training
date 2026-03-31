package traffic_manager;

public class TrafficManager {
    public static void main(String[] args) {
        WaitingQueue queue = new WaitingQueue(3);
        Roundabout roundabout = new Roundabout();

        queue.enqueue("CAR-101");
        queue.enqueue("CAR-102");
        queue.enqueue("CAR-103");
        queue.enqueue("CAR-104"); 
        String v1 = queue.dequeue();
        if (v1 != null) {
        	roundabout.addVehicle(v1);
        }
        String v2 = queue.dequeue();
        if (v2 != null) {
        	roundabout.addVehicle(v2);
        }
        roundabout.display();
        roundabout.removeVehicle();
        roundabout.display();
        String v3 = queue.dequeue();
        if (v3 != null) {
        	roundabout.addVehicle(v3);
        }
        roundabout.display();
    }
}
