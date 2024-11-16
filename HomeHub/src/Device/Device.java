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

    @Override
    protected void finalize() throws Throwable {
        deviceCount--;
        super.finalize();
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

    public abstract void operate(); // Polymorphism: Abstract method to be overridden by subclasses
}