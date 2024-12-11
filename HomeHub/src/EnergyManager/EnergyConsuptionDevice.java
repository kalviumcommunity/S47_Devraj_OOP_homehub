package Device;

// Abstract class for devices that consume energy
public abstract class EnergyConsumingDevice extends Device {
    protected double powerConsumption; // Tracks energy consumption of the device

    public EnergyConsumingDevice(String name, double powerConsumption) {
        super(name); // Inherit basic device properties
        this.powerConsumption = powerConsumption; // Initialize power consumption
    }

    public double getPowerConsumption() {
        return powerConsumption; // Getter for energy consumption
    }
}