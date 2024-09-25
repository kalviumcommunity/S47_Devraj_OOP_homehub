import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

public class Main {
    public static void main(String[] args) {

        // Set a global energy limit for all devices
        HomeHub.setEnergyLimit(5000.0); // Static function call

        // Create an instance of HomeHub
        HomeHub hub = new HomeHub();

        // Create instances of different devices
        Lighting livingRoomLight = new Lighting("Living Room Light");
        Thermostat homeThermostat = new Thermostat("Home Thermostat");
        SecuritySystem homeSecurity = new SecuritySystem("Home Security");

        // Add devices to the HomeHub
        hub.addLightingDevice(livingRoomLight);
        hub.addThermostatDevice(homeThermostat);
        hub.addSecurityDevice(homeSecurity);

        // Control all devices
        hub.controlDevices();

        // Display the total number of devices added using the static method
        System.out.println("Total devices in the HomeHub: " + HomeHub.getTotalDevices());
        // Display the total energy
        // consumption
        hub.displayEnergyConsumption();
    }
}

// Static Member Function (setEnergyLimit) in HomeHub:

// The method setEnergyLimit in the HomeHub class is static and is used
// configure a system-wide energy consumption limit.
// The energy limit is set through a call to EnergyManager.setGlobalEnergyLimit,
// a static function in EnergyManager.