package Utility;

import Device.Device;
import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private List<Device> devices; // Centralized device management

    public DeviceManager() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void controlAllDevices() {
        for (Device device : devices) {
            device.turnOn();
            device.operate();
        }
    }

    public void resetAllDevices() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}