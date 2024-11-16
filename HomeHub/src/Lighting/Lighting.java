package Lighting;

import Device.Device;

public class Lighting extends Device {
    private int brightness; // Encapsulation: private field

    public Lighting(String name) {
        super(name);
        this.brightness = 100;
    }

    public int getBrightness() { // Encapsulation: getter method
        return brightness;
    }

    public void setBrightness(int level) { // Encapsulation: setter method
        this.brightness = level;
    }

    @Override
    public void operate() {
        if (isOn()) {
            System.out.println(getDeviceName() + " is operating at brightness " + brightness + "%");
        } else {
            System.out.println(getDeviceName() + " is off.");
        }
    }
}