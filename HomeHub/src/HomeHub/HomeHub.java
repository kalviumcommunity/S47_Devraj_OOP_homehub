package HomeHub;

import Device.Device;
import EnergyManager.EnergyManager;
import Lighting.Lighting;
import Thermostate.Thermostat;
import SecuritySystem.SecuritySystem;
import java.util.ArrayList;
import java.util.List;

//Added DeviceManager to handel SRP
import Utility.DeviceManager;

public class HomeHub {
    private List<Lighting> lightingDevices;
    private List<Thermostat> thermostatDevices;
    private List<SecuritySystem> securityDevices;
    private EnergyManager energyManager;
    private static int totalDevices = 0;
    private DeviceManager deviceManager; // Added DeviceManager

    public HomeHub() {
        this.lightingDevices = new ArrayList<>();
        this.thermostatDevices = new ArrayList<>();
        this.securityDevices = new ArrayList<>();
        this.energyManager = new EnergyManager();
        this.deviceManager = new DeviceManager(); // Instantiate DeviceManager
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public void addLightingDevice(Lighting lighting) {
        deviceManager.addDevice(lighting); // Moved responsibility to DeviceManager
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
        deviceManager.controlAllDevices(); //Delegated control logic to DeviceManager
    }

    public void displayEnergyConsumption() {
        System.out.println("Total energy consumption: " +
                energyManager.getTotalConsumption() + " watts");
    }

    public void resetSystem() {
        energyManager.resetConsumption();
        deviceManager.resetAllDevices(); //Delegated reset logic to DeviceManager
    }
}