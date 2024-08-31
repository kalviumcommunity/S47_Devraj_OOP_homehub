package Lighting;

import Device.Device;

public class Lighting extends Device {
    private int brightness;

    public Lighting(String name) {
        super(name);
        this.brightness = 100; // Default brightness
    }

    public void setBrightness(int level) {
        this.brightness = level;
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is operating at brightness " + brightness + "%");
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}
