import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

public class Main {
    public static void main(String[] args) {
        HomeHub.setEnergyLimit(5000.0);

        HomeHub hub = new HomeHub(); // Constructor: Initializes the HomeHub

        Lighting livingRoomLight = new Lighting("Living Room Light"); // Constructor: Initializes the lighting device
        Thermostat homeThermostat = new Thermostat("Home Thermostat"); // Constructor: Initializes the thermostat device
        SecuritySystem homeSecurity = new SecuritySystem("Home Security"); // Constructor: Initializes the security system

        hub.addLightingDevice(livingRoomLight);
        hub.addThermostatDevice(homeThermostat);
        hub.addSecurityDevice(homeSecurity);

        hub.controlDevices();

        System.out.println("Total devices in the HomeHub: " + HomeHub.getTotalDevices());
        hub.displayEnergyConsumption();
    }
}