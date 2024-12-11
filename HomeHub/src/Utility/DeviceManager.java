package Utility;

import Device.Device;
import Device.EnergyConsumingDevice;
import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private List<Device> devices;

    public DeviceManager() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    // New method to calculate and display total energy consumption
    public void displayEnergyConsumption() {
        double totalEnergy = 0;
        for (Device device : devices) {
            // Check if device is an energy-consuming device
            if (device instanceof EnergyConsumingDevice) {
                totalEnergy += ((EnergyConsumingDevice) device).getPowerConsumption();
            }
        }
        System.out.println("Total energy consumption: " + totalEnergy + " watts.");
    }

    public void controlAllDevices() {
        for (Device device : devices) {
            device.turnOn();
            device.operate();
        }
    }
}