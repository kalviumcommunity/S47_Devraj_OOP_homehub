package SecuritySystem;

import Device.Device;

public class SecuritySystem extends Device {
    private boolean alarmArmed;

    public SecuritySystem(String name) {
        super(name);
        this.alarmArmed = false;
    }

    public void armAlarm() {
        this.alarmArmed = true;
    }

    public void disarmAlarm() {
        this.alarmArmed = false;
    }

    @Override
    public void operate() {
        if (isOn) {
            System.out.println(deviceName + " is " + (alarmArmed ? "armed" : "disarmed"));
        } else {
            System.out.println(deviceName + " is off.");
        }
    }
}
