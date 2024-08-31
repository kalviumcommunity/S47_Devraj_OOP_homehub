package EnergyManager;

public class EnergyManager {
    private int totalConsumption;

    public EnergyManager() {
        this.totalConsumption = 0;
    }

    public void addConsumption(int watts) {
        totalConsumption += watts;
    }

    public void resetConsumption() {
        totalConsumption = 0;
    }

    public int getTotalConsumption() {
        return totalConsumption;
    }
}
