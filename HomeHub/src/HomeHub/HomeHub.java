package HomeHub;

import Device.Device;
import EnergyManager.EnergyManager;
import java.util.ArrayList;
import java.util.List;

// Class to manage all devices and interactions in the smart home
public class HomeHub {
    private List<Device> devices; // List to store devices
    private EnergyManager energyManager; // Object to manage energy consumption

    // Constructor to initialize the HomeHub
    public HomeHub() {
        this.devices = new ArrayList<>();
        this.energyManager = new EnergyManager();
    }

    // Method to add a device to the HomeHub
    public void addDevice(Device device) {
        devices.add(device);
    }

    // Method to control and operate all devices
    public void controlDevices() {
        for (Device device : devices) {
            device.turnOn();
            device.operate();
        }
    }

    // Method to display the total energy consumption
    public void displayEnergyConsumption() {
        System.out.println("Total energy consumption: " + energyManager.getTotalConsumption() + " watts");
    }

    // Method to reset the system (turn off all devices and reset energy
    // consumption)
    public void resetSystem() {
        energyManager.resetConsumption();
        for (Device device : devices) {
            device.turnOff();
        }
    }
}