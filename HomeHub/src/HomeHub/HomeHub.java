package HomeHub;

import Device.Device;
import EnergyManager.EnergyManager;
import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<Device> devices;
    private EnergyManager energyManager;

    public HomeHub() {
        this.devices = new ArrayList<>();
        this.energyManager = new EnergyManager();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void controlDevices() {
        for (Device device : devices) {
            device.turnOn();
            device.operate();
        }
    }

    public void displayEnergyConsumption() {
        System.out.println("Total energy consumption: " + energyManager.getTotalConsumption() + " watts");
    }

    public void resetSystem() {
        energyManager.resetConsumption();
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
