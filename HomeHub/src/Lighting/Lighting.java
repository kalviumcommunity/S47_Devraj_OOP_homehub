package Lighting;

import Device.Device;

// Derived class representing a lighting system
public class Lighting extends Device {
    private int brightness; // Brightness level of the lighting

    // Constructor to initialize the lighting with a name
    public Lighting(String name) {
        super(name);
        this.brightness = 100; // Default brightness level
    }

    // Method to set the brightness level
    public void setBrightness(int level) {
        this.brightness = level;
    }

    // Overridden method to operate the lighting
    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is operating at brightness " + brightness + "%");
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}