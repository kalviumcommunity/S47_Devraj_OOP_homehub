import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;
import SecurityDevice.SecurityDevice; // Added import for new SecurityDevice class

public class Main {
    public static void main(String[] args) {
        HomeHub.setEnergyLimit(5000.0);

        HomeHub hub = new HomeHub();

        Lighting livingRoomLight = new Lighting("Living Room Light");
        Thermostat homeThermostat = new Thermostat("Home Thermostat");
        SecurityDevice homeSecurity = new SecurityDevice("Home Security"); // Added SecurityDevice instance

        hub.addLightingDevice(livingRoomLight);
        hub.addThermostatDevice(homeThermostat);
        hub.addDevice(homeSecurity); // Added SecurityDevice to the hub

        hub.controlDevices();

        System.out.println("Total devices in the HomeHub: " + Device.getTotalDeviceCount());
        hub.displayEnergyConsumption();
    }
}