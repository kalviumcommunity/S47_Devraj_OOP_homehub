package Thermostate;

import Device.Device;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    @Override
    public void operate() { // Abstraction: implementation of the abstract method
        if (isOn()) {
            System.out.println(getDeviceName() + " is set to " + temperature + "°C");
        } else {
            System.out.println(getDeviceName() + " is off.");
        }
    }
}