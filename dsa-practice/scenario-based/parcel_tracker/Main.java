package parcel_tracker;

public class Main {
    public static void main(String[] args) {
        ParcelChain parcel = new ParcelChain();
        parcel.trackParcel();
        parcel.addCheckpoint("Shipped", "Customs Clearance");
        parcel.trackParcel();
        parcel.markParcelLost();
        parcel.trackParcel();
    }
}
