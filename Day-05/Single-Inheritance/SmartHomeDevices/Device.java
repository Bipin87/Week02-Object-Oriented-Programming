package SmartHomeDevices;
// Base class
public class Device {
    // Attributes
    private int deviceId;
    private String status;

    // Constructor
    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display Device details
    public void displayStatus(){
        System.out.println("Device id: "+ deviceId + "\n device status: " + status);

    }
    
}
