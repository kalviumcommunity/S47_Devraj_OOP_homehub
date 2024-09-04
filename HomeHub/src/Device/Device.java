package Device;

// Abstract class representing a generic device
public abstract class Device {
    protected String deviceName; // Name of the device
    protected boolean isOn; // State of the device (on or off)
    private static int deviceCount = 0; // Static variable to count the number of devices

    // Constructor to initialize the device with a name
    public Device(String name) {
        this.deviceName = name;
        this.isOn = false;
        deviceCount++;
    }

    // Static method to get the total count of devices
    public static int getTotalDeviceCount() {
        return deviceCount;
    }

    // Method to turn on the device
    public void turnOn() {
        this.isOn = true;
    }

    // Method to turn off the device
    public void turnOff() {
        this.isOn = false;
    }

    // Abstract method that must be implemented by derived classes
    public abstract void operate();
}