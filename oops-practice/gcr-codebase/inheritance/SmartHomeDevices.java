class Device {
    protected String deviceId;
    protected String status; 
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
class Thermostat extends Device {
    protected double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void displayStatus() {
        System.out.println("Thermostat ID: " + deviceId + ", Status: " + status + 
                          ", Temperature: " + temperatureSetting + "°C");
    }
}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device[] devices = {
            new Device("D001", "ON"),
            new Thermostat("T001", "ON", 20.5),
            new Thermostat("T002", "OFF", 35.0)
        };
        for (Device d : devices) {
            d.displayStatus(); 
        }
    }
}
