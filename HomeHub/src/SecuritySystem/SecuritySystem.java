package SecuritySystem;

import Device.Device;

public class SecuritySystem extends Device {
    private boolean alarmArmed;

    public SecuritySystem(String name) {
        super(name);
        this.alarmArmed = false;
    } // Constructor: Initializes the security system with a name and default alarm state

    public boolean isAlarmArmed() {
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