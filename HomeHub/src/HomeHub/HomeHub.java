package HomeHub;

import Device.Device;
import EnergyManager.EnergyManager;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;
import java.util.ArrayList;
import java.util.List;

// Class to manage all devices and interactions in the smart home
public class HomeHub {
    private List<Lighting> lightingDevices; // List to store Lighting devices
    private List<Thermostat> thermostatDevices; // List to store Thermostat devices
    private List<SecuritySystem> securityDevices; // List to store SecuritySystem devices
    private EnergyManager energyManager; // Object to manage energy consumption

    // Constructor to initialize the HomeHub
    public HomeHub() {
        this.lightingDevices = new ArrayList<>();
        this.thermostatDevices = new ArrayList<>();
        this.securityDevices = new ArrayList<>();
        this.energyManager = new EnergyManager();
    }

    // Method to add a Lighting device to the HomeHub
    public void addLightingDevice(Lighting lighting) {
        lightingDevices.add(lighting);
    }

    // Method to add a Thermostat device to the HomeHub
    public void addThermostatDevice(Thermostat thermostat) {
        thermostatDevices.add(thermostat);
    }

    // Method to add a SecuritySystem device to the HomeHub
    public void addSecurityDevice(SecuritySystem securitySystem) {
        securityDevices.add(securitySystem);
    }

    // Method to control and operate all devices
    public void controlDevices() {
        // Operate each Lighting device
        for (Lighting lighting : lightingDevices) {
            lighting.turnOn();
            lighting.operate();
        }

        // Operate each Thermostat device
        for (Thermostat thermostat : thermostatDevices) {
            thermostat.turnOn();
            thermostat.operate();
        }

        // Operate each SecuritySystem device
        for (SecuritySystem securitySystem : securityDevices) {
            securitySystem.turnOn();
            securitySystem.operate();
        }
    }

    // Method to display the total energy consumption
    public void displayEnergyConsumption() {
        System.out.println("Total energy consumption: " +
                energyManager.getTotalConsumption() + " watts");
    }

    // Method to reset the system (turn off all devices and reset energy
    // consumption)
    public void resetSystem() {
        energyManager.resetConsumption();

        // Turn off all Lighting devices
        for (Lighting lighting : lightingDevices) {
            lighting.turnOff();
        }

        // Turn off all Thermostat devices
        for (Thermostat thermostat : thermostatDevices) {
            thermostat.turnOff();
        }

        // Turn off all SecuritySystem devices
        for (SecuritySystem securitySystem : securityDevices) {
            securitySystem.turnOff();
        }
    }
}
