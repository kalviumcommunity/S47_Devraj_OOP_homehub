package HomeHub;

import Device.Device;
import EnergyManager.EnergyManager;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;
import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<Lighting> lightingDevices;
    private List<Thermostat> thermostatDevices;
    private List<SecuritySystem> securityDevices;
    private EnergyManager energyManager;
    private static int totalDevices = 0;

    public HomeHub() {
        this.lightingDevices = new ArrayList<>();
        this.thermostatDevices = new ArrayList<>();
        this.securityDevices = new ArrayList<>();
        this.energyManager = new EnergyManager();
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public void addLightingDevice(Lighting lighting) {
        lightingDevices.add(lighting);
        totalDevices++;
    }

    public void addThermostatDevice(Thermostat thermostat) {
        thermostatDevices.add(thermostat);
        totalDevices++;
    }

    public void addSecurityDevice(SecuritySystem securitySystem) {
        securityDevices.add(securitySystem);
        totalDevices++;
    }

    public static void setEnergyLimit(double limit) {
        EnergyManager.setGlobalEnergyLimit(limit);
    }

    public void controlDevices() {
        for (Lighting lighting : lightingDevices) {
            lighting.turnOn();
            lighting.operate(); // Polymorphism: Calling the overridden method
        }

        for (Thermostat thermostat : thermostatDevices) {
            thermostat.turnOn();
            thermostat.operate(); // Polymorphism: Calling the overridden method
        }

        for (SecuritySystem securitySystem : securityDevices) {
            securitySystem.turnOn();
            securitySystem.operate(); // Polymorphism: Calling the overridden method
        }
    }

    public void displayEnergyConsumption() {
        System.out.println("Total energy consumption: " +
                energyManager.getTotalConsumption() + " watts");
    }

    public void resetSystem() {
        energyManager.resetConsumption();

        for (Lighting lighting : lightingDevices) {
            lighting.turnOff();
        }

        for (Thermostat thermostat : thermostatDevices) {
            thermostat.turnOff();
        }

        for (SecuritySystem securitySystem : securityDevices) {
            securitySystem.turnOff();
        }
    }
}