package EnergyManager;

public class EnergyManager {
    private double totalConsumption;
    private static double globalEnergyLimit = 10000.0;

    public EnergyManager() {
        this.totalConsumption = 0;
    } // Constructor: Initializes the EnergyManager with zero total consumption

    public void addConsumption(double consumption) {
        this.totalConsumption += consumption;
    }

    public double getTotalConsumption() {
        return this.totalConsumption;
    }

    public void resetConsumption() {
        this.totalConsumption = 0;
    }

    public static void setGlobalEnergyLimit(double limit) {
        globalEnergyLimit = limit;
        System.out.println("Global energy limit set to: " + globalEnergyLimit + " watts");
    }

    public static double getGlobalEnergyLimit() {
        return globalEnergyLimit;
    }
}