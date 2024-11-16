package Thermostate;

import Device.Device;

public class Thermostat extends Device {
    private int temperature; // Encapsulation: private field

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    public int getTemperature() { // Encapsulation: getter method
        return temperature;
    }

    public void setTemperature(int temp) { // Encapsulation: setter method
        this.temperature = temp;
    }

    @Override
    public void operate() {
        if (isOn()) {
            System.out.println(getDeviceName() + " is set to " + temperature + "°C");
        } else {
            System.out.println(getDeviceName() + " is off.");
        }
    }
}