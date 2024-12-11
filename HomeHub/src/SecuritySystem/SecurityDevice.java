// Added a new class to demonstrate Open/Closed Principle (extension of Device without modification of existing code)
package SecurityDevice;

import Device.Device;

public class SecurityDevice extends Device {
    public SecurityDevice(String name) {
        super(name); // Constructor to initialize the SecurityDevice
    }

    @Override
    public void operate() {
        // Overridden method to define specific behavior for SecurityDevice
        System.out.println(this.deviceName + " is securing the premises.");
    }
}