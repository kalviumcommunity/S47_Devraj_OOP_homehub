package Lighting;

import Device.EnergyConsumingDevice;

// Lighting now extends EnergyConsumingDevice to reflect energy usage
public class Lighting extends EnergyConsumingDevice {
    public Lighting(String name, double powerConsumption) {
        super(name, powerConsumption); // Pass power consumption to superclass
    }

    @Override
    public void operate() {
        System.out.println(this.deviceName + " is providing light and consuming " +
                this.powerConsumption + " watts."); // Indicate energy consumption
    }
}