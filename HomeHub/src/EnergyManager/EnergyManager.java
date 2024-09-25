package EnergyManager;

public class EnergyManager {
    private double totalConsumption;

    // Static variable to hold the global energy limit
    private static double globalEnergyLimit = 10000.0; // Default limit in watts

    public EnergyManager() {
        this.totalConsumption = 0;
    }

    // Method to add energy consumption
    public void addConsumption(double consumption) {
        this.totalConsumption += consumption;
    }

    // Method to get the total energy consumption
    public double getTotalConsumption() {
        return this.totalConsumption;
    }

    // Method to reset energy consumption
    public void resetConsumption() {
        this.totalConsumption = 0;
    }

    // Static method to set the global energy limit
    public static void setGlobalEnergyLimit(double limit) {
        globalEnergyLimit = limit;
        System.out.println("Global energy limit set to: " + globalEnergyLimit + " watts");
    }

    // Static method to get the global energy limit
    public static double getGlobalEnergyLimit() {
        return globalEnergyLimit;
    }
}

// Static Member Functions (setGlobalEnergyLimit, getGlobalEnergyLimit):
// These static functions manage a class-wide energy limit for the entire
// system. They do not depend on any instance of EnergyManager, so we can call
// them directly from the class.
