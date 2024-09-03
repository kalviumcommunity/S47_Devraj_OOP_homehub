package Resident;

// Class to represent a resident of the smart home
public class Resident {
    private String name; // Name of the resident
    private String routine; // Daily routine of the resident

    // Constructor to initialize the resident with a name and routine
    public Resident(String name, String routine) {
        this.name = name;
        this.routine = routine;
    }

    // Method to set the resident's routine
    public void setRoutine(String routine) {
        this.routine = routine;
    }

    // Method to get the resident's routine
    public String getRoutine() {
        return routine;
    }
}
