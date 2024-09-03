package EnergyManager;

// Class to manage energy consumption of devices
public class EnergyManager {
    private int totalConsumption; // Total energy consumption in watts

    // Constructor to initialize the energy manager
    public EnergyManager() {
        this.totalConsumption = 0;
    }

    // Method to add energy consumption
    public void addConsumption(int watts) {
        totalConsumption += watts;
    }

    // Method to reset total energy consumption
    public void resetConsumption() {
        totalConsumption = 0;
    }

    // Method to get the total energy consumption
    public int getTotalConsumption() {
        return totalConsumption;
    }
}
