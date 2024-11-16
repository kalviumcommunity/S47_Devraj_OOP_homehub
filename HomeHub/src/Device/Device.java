package Device;

public abstract class Device {
    private String deviceName; // Encapsulation: private field
    private boolean isOn; // Encapsulation: private field
    private static int deviceCount = 0;

    public Device(String name) {
        this.deviceName = name;
        this.isOn = false;
        deviceCount++;
    }

    public static int getTotalDeviceCount() {
        return deviceCount;
    }

    public String getDeviceName() { // Encapsulation: getter method
        return deviceName;
    }

    public void setDeviceName(String deviceName) { // Encapsulation: setter method
        this.deviceName = deviceName;
    }

    public boolean isOn() { // Encapsulation: getter method
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public abstract void operate();
}