package Resident;

public class Resident {
    private String name;
    private String routine;

    public Resident(String name, String routine) {
        this.name = name;
        this.routine = routine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoutine() {
        return routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }
}