package Resident;

public class Resident {
    private String name; // Encapsulation: private field
    private String routine; // Encapsulation: private field

    public Resident(String name, String routine) {
        this.name = name;
        this.routine = routine;
    }

    public String getName() { // Encapsulation: getter method
        return name;
    }

    public void setName(String name) { // Encapsulation: setter method
        this.name = name;
    }

    public String getRoutine() { // Encapsulation: getter method
        return routine;
    }

    public void setRoutine(String routine) { // Encapsulation: setter method
        this.routine = routine;
    }
}