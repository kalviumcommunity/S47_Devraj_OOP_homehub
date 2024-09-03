import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

// Main class to run the simulation
public class Main {
    public static void main(String[] args) {
        // Create the HomeHub instance
        HomeHub hub = new HomeHub();

        // Create instances of different devices
        Lighting livingRoomLight = new Lighting("Living Room Light");
        Thermostat homeThermostat = new Thermostat("Home Thermostat");
        SecuritySystem homeSecurity = new SecuritySystem("Home Security");

        // Add devices to the HomeHub
        hub.addDevice(livingRoomLight);
        hub.addDevice(homeThermostat);
        hub.addDevice(homeSecurity);

        // Control all devices and display energy consumption
        hub.controlDevices();
        hub.displayEnergyConsumption();
    }
}