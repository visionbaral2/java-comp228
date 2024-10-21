package Assignmnet3.Exercise2;

public abstract class GameTester {
    protected String name;
    protected boolean isFullTime;

    // Constructor
    public GameTester(String name, boolean isFullTime) {
        this.name = name;
        this.isFullTime = isFullTime;
    }

    // Getters for name and status
    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    // Abstract method to determine the salary
    public abstract double determineSalary();
}
