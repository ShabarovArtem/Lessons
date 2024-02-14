package Practicatask;

public abstract class Human {
    private boolean isMan;

    public Human(boolean isMan) {
        this.isMan = isMan;
    }
    public boolean isMan() {
        return isMan;
    }
    public abstract void getSalary();
}
