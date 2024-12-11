import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

public class Main {
    public static void main(String[] args) {
        HomeHub.setEnergyLimit(5000.0);

        HomeHub hub = new HomeHub();

        Lighting livingRoomLight = new Lighting("Living Room Light");
        Thermostat homeThermostat = new Thermostat("Home Thermostat");
        SecuritySystem homeSecurity = new SecuritySystem("Home Security");

        hub.addLightingDevice(livingRoomLight);
        hub.addThermostatDevice(homeThermostat);
        hub.addSecurityDevice(homeSecurity);

        hub.controlDevices();

        System.out.println("Total devices in the HomeHub: " + Device.getTotalDeviceCount());
        hub.displayEnergyConsumption();
    }
}