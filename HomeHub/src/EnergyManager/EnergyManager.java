package EnergyManager;

public class EnergyManager {
    private double totalConsumption; // Encapsulation: private field
    private static double globalEnergyLimit = 10000.0;

    public EnergyManager() {
        this.totalConsumption = 0;
    }

    public void addConsumption(double consumption) {
        this.totalConsumption += consumption;
    }

    public double getTotalConsumption() { // Encapsulation: getter method
        return this.totalConsumption;
    }

    public void resetConsumption() {
        this.totalConsumption = 0;
    }

    public static void setGlobalEnergyLimit(double limit) {
        globalEnergyLimit = limit;
        System.out.println("Global energy limit set to: " + globalEnergyLimit + " watts");
    }

    public static double getGlobalEnergyLimit() { // Encapsulation: getter method
        return globalEnergyLimit;
    }
}