package Resident;

public class Resident {
    private String name;
    private String routine;

    public Resident(String name, String routine) {
        this.name = name;
        this.routine = routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }

    public String getRoutine() {
        return routine;
    }
}
