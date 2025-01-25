package SmartHomeDevices;
// subclass 
public class Thermostat extends Device {
    // Attribute
    private int temperatureSetting;

    // Constructor
    public Thermostat(int deviceId, String status, int temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature: " + temperatureSetting + "degree C");
    }
    
}
