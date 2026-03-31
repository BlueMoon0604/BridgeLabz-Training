package parcel_tracker;

class ParcelChain {

    private StageNode head;
    public ParcelChain() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is lost");
            return;
        }
        StageNode current = head;
        System.out.print("Parcel Status: ");
        while (current != null) {
            System.out.print(current.stage + " -> ");
            current = current.next;
        }
        System.out.println("END");
    }
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;
        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoin.");
            return;
        }
        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;
        System.out.println("Checkpoint added: " + newStage);
    }
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost");
    }
}
