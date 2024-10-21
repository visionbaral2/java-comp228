package Assignmnet3.Exercise2;


public class FullTimeGameTester extends GameTester {
    private static final double FULL_TIME_SALARY = 3000.00;

    // Constructor
    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    public double determineSalary() {
        return FULL_TIME_SALARY;
    }

    // Display information for full-time game tester
    public void displayInfo() {
        System.out.println("Full-Time Game Tester Name: " + getName());
        System.out.println("Salary: $" + determineSalary());
    }
}