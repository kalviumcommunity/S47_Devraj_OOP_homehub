package Thermostat;

import Device.EnergyConsumingDevice;

// Thermostat now extends EnergyConsumingDevice to include power tracking
public class Thermostat extends EnergyConsumingDevice {
    public Thermostat(String name, double powerConsumption) {
        super(name, powerConsumption); // Initialize with name and energy usage
    }

    @Override
    public void operate() {
        System.out.println(this.deviceName + " is regulating temperature and consuming " +
                this.powerConsumption + " watts."); // Indicate energy consumption
    }
}