package Device;

public abstract class Device {
    protected String deviceName;
    protected boolean isOn;
    private static int deviceCount = 0;

    public Device(String name) {
        this.deviceName = name;
        this.isOn = false;
        deviceCount++;
    }

    public static int getTotalDeviceCount() {
        return deviceCount;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public abstract void operate();
}
