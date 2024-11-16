package Device;

public abstract class Device {
    private String deviceName;
    private boolean isOn;
    private static int deviceCount = 0;

    public Device(String name) {
        this.deviceName = name;
        this.isOn = false;
        deviceCount++;
    }

    public static int getTotalDeviceCount() {
        return deviceCount;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public abstract void operate(); // Abstraction: abstract method to be implemented by subclasses
}