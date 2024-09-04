import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

public class Main {
    public static void main(String[] args) {
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

        // Display the total energy consumption
        hub.displayEnergyConsumption();
    }
}
