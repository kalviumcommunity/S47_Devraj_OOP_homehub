package SecuritySystem;

import Device.Device;

// Derived class representing a security system
public class SecuritySystem extends Device {
    private boolean alarmArmed; // State of the alarm (armed or disarmed)

    // Constructor to initialize the security system with a name
    public SecuritySystem(String name) {
        super(name);
        this.alarmArmed = false; // Default state of the alarm
    }

    // Method to arm the security alarm
    public void armAlarm() {
        this.alarmArmed = true;
    }

    // Method to disarm the security alarm
    public void disarmAlarm() {
        this.alarmArmed = false;
    }

    // Overridden method to operate the security system
    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is " + (alarmArmed ? "armed" : "disarmed"));
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}