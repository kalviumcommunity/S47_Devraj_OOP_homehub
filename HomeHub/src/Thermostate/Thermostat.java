package Thermostate;

import Device.Device;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22; // Default temperature in Celsius
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is set to " + temperature + "°C");
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}
