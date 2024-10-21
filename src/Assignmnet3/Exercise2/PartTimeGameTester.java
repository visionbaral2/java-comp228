package Assignmnet3.Exercise2;

public class PartTimeGameTester extends GameTester {
    private static final double HOURLY_RATE = 20.00;
    private int hoursWorked;

    // Constructor
    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double determineSalary() {
        return hoursWorked * HOURLY_RATE;
    }

    // Display information for part-time game tester
    public void displayInfo() {
        System.out.println("Part-Time Game Tester Name: " + getName());
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + determineSalary());
    }
}
