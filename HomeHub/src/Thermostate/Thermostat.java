package Thermostate;

import Device.Device;

// Derived class representing a thermostat for temperature control
public class Thermostat extends Device {
    private int temperature; // Temperature setting

    // Constructor to initialize the thermostat with a name
    public Thermostat(String name) {
        super(name);
        this.temperature = 22; // Default temperature in Celsius
    }

    // Method to set the temperature
    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    // Overridden method to operate the thermostat
    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is set to " + temperature + "°C");
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}