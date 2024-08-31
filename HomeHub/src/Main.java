import HomeHub.HomeHub;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;

public class Main {
    public static void main(String[] args) {
        HomeHub hub = new HomeHub();

        Lighting livingRoomLight = new Lighting("Living Room Light");
        Thermostat homeThermostat = new Thermostat("Home Thermostat");
        SecuritySystem homeSecurity = new SecuritySystem("Home Security");

        hub.addDevice(livingRoomLight);
        hub.addDevice(homeThermostat);
        hub.addDevice(homeSecurity);

        hub.controlDevices();
        hub.displayEnergyConsumption();
    }
}