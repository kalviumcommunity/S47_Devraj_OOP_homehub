package Lighting;

import Device.Device;

public class Lighting extends Device {
    private int brightness;

    public Lighting(String name) {
        super(name);
        this.brightness = 100;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int level) {
        this.brightness = level;
    }

    @Override
    public void operate() { // Polymorphism: Overriding the abstract method
        if (isOn()) {
            System.out.println(getDeviceName() + " is operating at brightness " + brightness + "%");
        } else {
            System.out.println(getDeviceName() + " is off.");
        }
    }
}