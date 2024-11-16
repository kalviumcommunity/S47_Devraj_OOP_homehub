package SecuritySystem;

import Device.Device;

public class SecuritySystem extends Device {
    private boolean alarmArmed; // Encapsulation: private field

    public SecuritySystem(String name) {
        super(name);
        this.alarmArmed = false;
    }

    public boolean isAlarmArmed() { // Encapsulation: getter method
        return alarmArmed;
    }

    public void armAlarm() {
        this.alarmArmed = true;
    }

    public void disarmAlarm() {
        this.alarmArmed = false;
    }

    @Override
    public void operate() {
        if (isOn()) {
            System.out.println(getDeviceName() + " is " + (alarmArmed ? "armed" : "disarmed"));
        } else {
            System.out.println(getDeviceName() + " is off.");
        }
    }
}