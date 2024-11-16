package Thermostate;

import Device.Device;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;
    } // Constructor: Initializes the thermostat with a name and default temperature

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
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